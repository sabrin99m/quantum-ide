import React, { useRef } from 'react';

export default function Toolbar({ editorRef }) {
  const fileInputRef = useRef(null);

  // --- Importa file ---
  const handleImport = (event) => {
    const file = event.target.files[0];
    if (!file) return;

    const reader = new FileReader();
    reader.onload = (e) => {
      const code = e.target.result;
      // imposta il codice nell'editor
      editorRef.current?.setCode(code);
    };
    reader.readAsText(file);
  };

  // --- Salva file ---
  const handleSave = () => {
    const code = editorRef.current?.getCode() || "";
    const blob = new Blob([code], { type: "text/plain" });
    const url = URL.createObjectURL(blob);

    const a = document.createElement("a");
    a.href = url;
    a.download = "quantum_code.qc"; // estensione personalizzabile
    a.click();

    URL.revokeObjectURL(url);
  };

  // --- Help ---
  const handleHelp = () => {
    window.open("https://github.com/sabrin99m/quantum-ide", "_blank");
  };

  return (
    <div className="toolbar">
      <div className="toolbar-left">
        <button className="toolbar-btn" onClick={() => fileInputRef.current.click()}>
          📂 Import
        </button>
        <button className="toolbar-btn" onClick={handleSave}>
          💾 Save
        </button>
        <input
          type="file"
          ref={fileInputRef}
          accept=".txt,.qc,.py,.qasm"
          style={{ display: "none" }}
          onChange={handleImport}
        />
      </div>

      <div className="toolbar-right">
        <button className="toolbar-btn help-btn" onClick={handleHelp}>
          ❔ Help
        </button>
      </div>
    </div>
  );
}

