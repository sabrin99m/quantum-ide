import React from 'react';

export default function OutputConsole({ output }) {
  return (
    <div className={`output-text ${
      output.includes("❌") ? "error" :
      output.includes("⚠️") ? "warning" :
      output.includes("✅") ? "success" : ""
    }`}>
      {output}
    </div>

  );
}

