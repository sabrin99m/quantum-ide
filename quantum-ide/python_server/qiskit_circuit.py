import json
from qiskit import QuantumCircuit
from qiskit_aer import AerSimulator

# 1️⃣ carica il JSON del circuito
circuit_json = """
{
  "qubits": ["q1"],
  "bits": ["a"],
  "operations": [
    { "name": "H", "type": "GATE", "targets": ["q1"], "to": [], "params": [], "column": 0 },
    { "name": "MEASURE", "type": "MEASURE", "targets": ["q1"], "to": ["a"], "params": [], "column": 1 }
  ]
}
"""

data = json.loads(circuit_json)

# 2️⃣ crea un QuantumCircuit con lo stesso numero di qubit e bit
num_qubits = len(data["qubits"])
num_bits = len(data["bits"])
qc = QuantumCircuit(num_qubits, num_bits)

# 3️⃣ mappa nomi (q1 → indice 0, ecc.)
qubit_index = {name: i for i, name in enumerate(data["qubits"])}
bit_index = {name: i for i, name in enumerate(data["bits"])}

# 4️⃣ traduci ogni operazione
for op in data["operations"]:
    name = op["name"].upper()
    targets = [qubit_index[t] for t in op["targets"]]
    tos = [bit_index[b] for b in op["to"]]
    
    if name == "H":
        qc.h(targets[0])
    elif name == "X":
        qc.x(targets[0])
    elif name == "CX":
        qc.cx(targets[0], targets[1])
    elif name == "MEASURE":
        qc.measure(targets[0], tos[0])
    # puoi aggiungere altre porte qui: Y, Z, RX, RY, ecc.

# 5️⃣ mostra il circuito
print(qc.draw())

sim = AerSimulator()

job = sim.run(qc)
result = job.result()

print("Risultati simulazione locale:", result.get_counts())


