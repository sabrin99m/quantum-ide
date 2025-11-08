package com.example.quantum_ide_backend.controller;

import com.example.quantum_ide_backend.controller.helper_functions.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/compiler")
@CrossOrigin(origins = "http://localhost:5173") // frontend dev server di Vite
public class CompilerController {

     @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @PostMapping("/lex")
public ResponseEntity<Map<String, Object>> analyzeLex(@RequestBody CompileRequest codeRequest) {
    String code = codeRequest.getCode();

    ErrorCollectingQuantumLexer lexer = new ErrorCollectingQuantumLexer(new ANTLRStringStream(code));
    List<Map<String, Object>> errors = new ArrayList<>();

    try {
        Token token;
        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            int type = token.getType();

            // Se il lexer emette un token non riconosciuto
            if (type == Token.INVALID_TOKEN_TYPE) {
                Map<String, Object> err = new HashMap<>();
                err.put("msg", "Token not valid: '" + token.getText() + "'");
                err.put("line", token.getLine());
                err.put("column", token.getCharPositionInLine());
                errors.add(err);
            }
        }

        // Aggiungi anche gli errori catturati via emitErrorMessage
        for (String msg : lexer.getErrors()) {
            Map<String, Object> err = new HashMap<>();
            err.put("msg", msg);

            // tenta di estrarre "linea:colonna" se presente
            int line = 0, col = 0;
            try {
                if (msg.contains("line")) {
                    String[] parts = msg.split("line")[1].trim().split(":");
                    line = Integer.parseInt(parts[0].trim());
                    col = Integer.parseInt(parts[1].split(" ")[0].trim());
                }
            } catch (Exception ignored) {}

            err.put("line", line);
            err.put("column", col);
            errors.add(err);
        }

    } catch (Exception e) {
        Map<String, Object> err = new HashMap<>();
        err.put("msg", "Errore during scan: " + e.getMessage());
        err.put("line", 0);
        err.put("column", 0);
        errors.add(err);
    }

    Map<String, Object> response = new HashMap<>();
    response.put("errors", errors);

    return ResponseEntity.ok(response);
}

@PostMapping("/analyze")
public ResponseEntity<Map<String, Object>> analyzeCode(@RequestBody CompileRequest request) {
    String code = request.getCode();
    Map<String, Object> response = new HashMap<>();

    try {
        // Lexer con raccolta errori
        ErrorCollectingQuantumLexer lexer = new ErrorCollectingQuantumLexer(new ANTLRStringStream(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Parser con raccolta errori
        ErrorCollectingQuantumParser parser = new ErrorCollectingQuantumParser(tokens);
        QuantumParser.program_return result = parser.program();
        CommonTree ast = (CommonTree) result.getTree();

        // Analisi semantica
        QuantumSemanticAnalyzer semanticAnalyzer = new QuantumSemanticAnalyzer();
        semanticAnalyzer.analyze(ast);

        // Recupera errori
        List<String> lexerErrors = lexer.getErrors();
        List<String> parserErrors = parser.getErrors();
        List<String> semanticErrors = semanticAnalyzer.getErrors();

        // Combina tutto
        List<String> allErrors = new ArrayList<>();
        allErrors.addAll(lexerErrors);
        allErrors.addAll(parserErrors);
        allErrors.addAll(semanticErrors);

        if (allErrors.isEmpty()) {
            response.put("success", true);
            response.put("message", "✅ Analysis completed.");
        } else {
            response.put("success", false);
            response.put("message", "❌ Errors found.");
            response.put("errors", allErrors);
        }

    } catch (Exception e) {
        response.put("success", false);
        response.put("message", "Internal error: " + e.getMessage());
    }

    return ResponseEntity.ok(response);
}
    
    @PostMapping("/run")
    public ResponseEntity<Map<String, Object>> run(@RequestBody Map<String, String> req) {
        String code = req.get("code");

        try {      
            // Lexer con raccolta errori
            ErrorCollectingQuantumLexer lexer = new ErrorCollectingQuantumLexer(new ANTLRStringStream(code));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Parser con raccolta errori
            ErrorCollectingQuantumParser parser = new ErrorCollectingQuantumParser(tokens);
            QuantumParser.program_return result = parser.program();
            CommonTree ast = (CommonTree) result.getTree();

            // Generazione circuito
            QuantumCircuitGenerator visitor = new QuantumCircuitGenerator();
            QuantumCircuit circuit = visitor.generate(ast);

            // 2️⃣ Converti circuito in JSON
            ObjectMapper mapper = new ObjectMapper();
            String circuitJson = mapper.writeValueAsString(circuit);

            // 3️⃣ Lancia lo script Python e cattura l’ASCII
            ProcessBuilder pb = new ProcessBuilder(
                "python",
                "-X", "utf8",  // forza UTF-8
                "C:\\Users\\megan\\quantum-ide\\python_server\\quantum_backend.py"
            );

            Process process = pb.start();

            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()))) {
                writer.write(circuitJson);
                writer.flush();
                writer.close(); 
            }

            StringBuilder asciiBuilder = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
                BufferedReader errReader = new BufferedReader(
                    new InputStreamReader(process.getErrorStream(), StandardCharsets.UTF_8))) {

            String line;
            while ((line = reader.readLine()) != null) {
                asciiBuilder.append(line).append("\n");
            }

            String errLine;
            while ((errLine = errReader.readLine()) != null) {
                System.err.println("PYTHON ERR: " + errLine);
    }

        }
                    
        process.waitFor();
        String ascii = asciiBuilder.toString();


        // Ritorno al frontend 
        return ResponseEntity.ok(Map.of( 
            "success", true, 
            "circuit", circuit,
            "ascii", ascii
        )); 
    } catch (Exception e) { 
        e.printStackTrace(); 
        return ResponseEntity.internalServerError().body(Map.of( 
            "success", false, 
            "message", "Error: circuit generation failed, " + e.getMessage() 
            )); 
        } 
    }
    
    @PostMapping("/simulate")
    public ResponseEntity<Map<String, Object>> simulate(@RequestBody Map<String, String> req) {
        String code = req.get("code");

        try {      
            // Lexer con raccolta errori
            ErrorCollectingQuantumLexer lexer = new ErrorCollectingQuantumLexer(new ANTLRStringStream(code));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Parser con raccolta errori
            ErrorCollectingQuantumParser parser = new ErrorCollectingQuantumParser(tokens);
            QuantumParser.program_return result = parser.program();
            CommonTree ast = (CommonTree) result.getTree();

            // Generazione circuito
            QuantumCircuitGenerator visitor = new QuantumCircuitGenerator();
            QuantumCircuit circuit = visitor.generate(ast);

            // 2️⃣ Converti circuito in JSON
            ObjectMapper mapper = new ObjectMapper();
            String circuitJson = mapper.writeValueAsString(circuit);

            // 3️⃣ Lancia lo script Python e cattura l’ASCII
            ProcessBuilder pb = new ProcessBuilder(
                "C:/Users/megan/AppData/Local/Programs/Python/Python313/python.exe",
                "-X", "utf8",  // forza UTF-8
                "C:\\Users\\megan\\quantum-ide\\python_server\\print_output.py"
            );

            Process process = pb.start();

            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()))) {
                writer.write(circuitJson);
                writer.flush();
                writer.close(); 
            }

            StringBuilder outputBuilder = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
                BufferedReader errReader = new BufferedReader(
                    new InputStreamReader(process.getErrorStream(), StandardCharsets.UTF_8))) {

            String line;
            while ((line = reader.readLine()) != null) {
                outputBuilder.append(line).append("\n");
            }
        }
                    
        process.waitFor();
        String output = outputBuilder.toString();


        // Ritorno al frontend 
        return ResponseEntity.ok(Map.of( 
            "success", true, 
            "output", output
        )); 
    } catch (Exception e) { 
        e.printStackTrace(); 
        return ResponseEntity.internalServerError().body(Map.of( 
            "success", false, 
            "message", "Simulation error: " + e.getMessage() 
            )); 
        } 
    }
    
}



