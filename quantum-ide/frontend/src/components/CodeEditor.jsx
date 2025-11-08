// CodeEditor.jsx
import React, { useRef, useCallback, useImperativeHandle, forwardRef } from "react";
import { Editor } from "@monaco-editor/react";
import * as monaco from "monaco-editor";
import { registerQuantumLanguage } from "../language/quantum.js";

// debounce helper
function debounce(fn, delay) {
  let timeout;
  return (...args) => {
    clearTimeout(timeout);
    timeout = setTimeout(() => fn(...args), delay);
  };
}

// orwardRef per esportare funzioni a App.jsx
const CodeEditor = forwardRef((props, ref) => {
  const editorRef = useRef(null);

  function handleBeforeMount(monacoInstance) {
    registerQuantumLanguage(monacoInstance);
  }

  let errorDecorations = null;
  function showErrors(editor, monaco, errors) {
    if (!errorDecorations) {
      errorDecorations = editor.createDecorationsCollection();
    }
    if (!errors || !Array.isArray(errors)) {
      errorDecorations.clear();
      return;
    }

    const model = editor.getModel();
    if (!model) return;

    errorDecorations.set(
      errors.map((err) => {
        const line = err.line ?? 1;
        const startColumn = (err.column ?? 0) + 1;
        const message = err.msg ?? "Unknown error.";

        const word = model.getWordAtPosition({ lineNumber: line, column: startColumn });

        const range = word
          ? new monaco.Range(line, word.startColumn, line, word.endColumn)
          : new monaco.Range(line, startColumn, line, startColumn + 1);

        return {
          range,
          options: {
            hoverMessage: { value: message },
            className: "squiggly-error",
            overviewRuler: {
              color: "red",
              position: monaco.editor.OverviewRulerLane.Right,
            },
          },
        };
      })
    );
  }

  const handleChange = useCallback(
    debounce(async (value) => {
      try {
        const res = await fetch("/api/compiler/lex", {
          method: "POST",
          headers: { "Content-Type": "application/json" },
          body: JSON.stringify({ code: value }),
        });
        if (!res.ok) throw new Error("Errore dal server");
        const data = await res.json();
        if (editorRef.current) {
          showErrors(editorRef.current, monaco, data.errors || []);
        }
      } catch (err) {
        console.error("Errore durante l’analisi:", err);
      }
    }, 500),
    []
  );

   useImperativeHandle(ref, () => ({
    getCode: () => editorRef.current?.getValue() || "",
    setCode: (newCode) => {
      if (editorRef.current && typeof editorRef.current.setValue === "function") {
        editorRef.current.setValue(newCode);
      } else {
        console.warn("Monaco Editor not ready yet.");
      }
    },
  }));
  
  return (
    <div className="monaco-container">
      <Editor
        width="100%"
        height="100%"
        theme="quantum-dark"
        defaultLanguage="quantum"
        defaultValue={`// Write your code here.\nQUBIT q1;\nH q1;\nBIT a;\nMEASURE q1 -> a;`}
        beforeMount={handleBeforeMount}
        onMount={(editor) => {
          editorRef.current = editor;
        }}
        onChange={handleChange}
      />
    </div>
  );
});

export default CodeEditor;


