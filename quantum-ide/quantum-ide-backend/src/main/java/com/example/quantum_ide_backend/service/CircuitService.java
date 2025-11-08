/* 

package com.example.quantum_ide_backend.service;

import java.io.File;
import java.nio.file.Files;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CircuitService {

    public Map<String, Object> buildCircuit(String sourceCode) {
        try {
            // 1. Traduce dal tuo linguaggio custom a Python (semplifico qui con un esempio fisso)
            String pythonCode = """
                from qiskit import QuantumCircuit
                import matplotlib.pyplot as plt
                import io, base64, json

                qc = QuantumCircuit(2, 2)
                qc.h(0)
                qc.cx(0, 1)
                qc.measure([0,1], [0,1])

                fig = qc.draw(output="mpl")
                buf = io.BytesIO()
                fig.savefig(buf, format="png")
                buf.seek(0)
                img_base64 = base64.b64encode(buf.read()).decode("utf-8")

                print(json.dumps({"circuitImage": img_base64}))
            """;

            // 2. Scrive il codice Python in un file temporaneo
            File tempFile = File.createTempFile("qiskit_circuit", ".py");
            Files.writeString(tempFile.toPath(), pythonCode);

            // 3. Esegue Python
            ProcessBuilder pb = new ProcessBuilder("python3", tempFile.getAbsolutePath());
            pb.redirectErrorStream(true);
            Process process = pb.start();

            // 4. Legge output JSON
            String output = new String(process.getInputStream().readAllBytes());
            process.waitFor();

            // 5. Converte in mappa
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(output, new TypeReference<Map<String, Object>>() {});

        } catch (Exception e) {
            throw new RuntimeException("Errore durante la generazione del circuito", e);
        }
    }
}

*/