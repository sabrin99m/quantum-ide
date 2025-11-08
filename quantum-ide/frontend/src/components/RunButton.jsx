import React from "react";

export default function RunButton({ onRun }) {
  return (
    <button className="run-button" onClick={onRun}>
      ▶ Run
    </button>
  );
}
