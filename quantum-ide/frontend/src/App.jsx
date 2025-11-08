// App.jsx 
import React, { useRef, useState } from 'react'; 
import CodeEditor from './components/CodeEditor'; 
import CircuitPanel from './components/CircuitPanel'; 
import OutputConsole from './components/OutputConsole'; 
import RunButton from './components/RunButton'; 
import Toolbar from './components/Toolbar';
import './App.css'; 

export default function App() 
{ 
  const editorRef = useRef(null); 
  const [output, setOutput] = useState("Run to simulate circuit. Results will appear here."); 
  
  const handleRun = async () => { 
    const code = editorRef.current?.getCode() || ""; 
    try { 
      const res = await fetch("/api/compiler/analyze", { 
        method: "POST", 
        headers: { "Content-Type": "application/json" }, 
        body: JSON.stringify({ code }), 
      }); 
      if (!res.ok) throw new Error("Server error."); 
      
      const data = await res.json(); 
      if (data.success) { 
        setOutput(data.message); 
      } else { 
        const formattedErrors = data.errors 
        ? "❌ Errors found:\n" + data.errors.join("\n") 
        : "❌ Error found during analysis: " + data.message; setOutput(formattedErrors); 
        return; 
      } 
      
      // Se non ci sono errori → chiamata all’endpoint per costruire il circuito 
      const runRes = await fetch("/api/compiler/run", { 
        method: "POST", 
        headers: { "Content-Type": "application/json" }, 
        body: JSON.stringify({ code }), 
      }); 
      
      if (!runRes.ok) throw new Error("Error found while generating circuit."); 
      
      const runData = await runRes.json(); 
      
      // Mostrare circuito in CircuitPanel 
      if (runData.ascii) { 
        setOutput("✅ Circuit generation: successfull. \nWait for simulation results...")
        window.dispatchEvent(new CustomEvent("circuitGenerated", { detail: runData.ascii}));
      } else { 
        setOutput("⚠️ No circuit generated."); 
      } 

    // Stampare output in OutputConsole
    const outputRes = await fetch("/api/compiler/simulate", { 
        method: "POST", 
        headers: { "Content-Type": "application/json" }, 
        body: JSON.stringify({ code }), 
      }); 
      
      if (!outputRes.ok) throw new Error("Simulation error."); 
      
      const outputData = await outputRes.json(); 
      
      // Mostrare output in OutputPanel 
      if (outputData.output) { 
        setOutput("Simulation result: \n" + outputData.output)
      } else { 
        setOutput("⚠️ Simulation error."); 
      } 
    } catch (err) { 
      setOutput("Server communication error."); 
    } 

  }; 
  

  return ( 
  <div className="app-container">
      {/* 🔹 Barra superiore */}
      <Toolbar editorRef={editorRef} />

      <div className="main-area">
        {/* 🔹 Pannello codice */}
        <div className="panel editor-panel">
          <div className="panel-header">
            <span>Code Editor</span>
            <RunButton onRun={handleRun} />
          </div>
          <div className="panel-body">
            <CodeEditor ref={editorRef} />
          </div>
        </div>

        {/* 🔹 Pannello circuito */}
        <div className="panel circuit-panel">
          <div className="panel-header">Circuit Visualization</div>
          <div className="panel-body">
            <CircuitPanel />
          </div>
        </div>

        {/* 🔹 Pannello output */}
        <div className="panel output-panel">
          <div className="panel-header">Simulation Output</div>
          <div className="panel-body">
            <OutputConsole output={output} />
          </div>
        </div>
      </div>
    </div>
  );
  }
  