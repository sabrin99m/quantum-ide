// CircuitPanel.jsx

import { useState, useEffect } from 'react'; 

export default function CircuitPanel() {
  const [circuit, setCircuit] = useState(null);

  useEffect(() => {
    const handleCircuitEvent = (e) => {
      setCircuit(e.detail);
    };

    window.addEventListener('circuitGenerated', handleCircuitEvent);
    return () => window.removeEventListener('circuitGenerated', handleCircuitEvent);
  }, []);

  return (
    <div className="circuit-panel">
    {circuit ? (
      <pre className="circuit-text">{circuit}</pre>
    ) : (
      <div className="circuit-placeholder">
        ⚛️ Waiting for circuit generation...
      </div>
    )}
  </div>
  );
}


