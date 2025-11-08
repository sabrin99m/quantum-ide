import json
import math
from qiskit import QuantumCircuit


def safe_eval(expr):
    """
    Valuta un'espressione numerica semplice in modo sicuro.
    Supporta costanti PI, EULER e funzioni matematiche base.
    """
    if not isinstance(expr, str):
        return expr

    expr = expr.replace("^", "**")  # compatibilità con notazione ^

    allowed_names = {
        "PI": math.pi,
        "EULER": math.e,
        "SQRT2": math.sqrt(2),
        "sin": math.sin,
        "cos": math.cos,
        "tan": math.tan,
        "log": math.log,
        "sqrt": math.sqrt,
        "exp": math.exp
    }

    try:
        return eval(expr, {"__builtins__": {}}, allowed_names)
    except Exception:
        try:
            return float(expr)
        except Exception:
            return 0.0

def unique_qubits(qubits):
    # Rimuove duplicati mantenendo l'ordine
    seen = set()
    result = []
    for q in qubits:
        if q not in seen:
            seen.add(q)
            result.append(q)
    return result

def from_json_to_qc(data):
    """
    Converte il JSON ricevuto dal backend Java in un QuantumCircuit Qiskit.
    """
    num_qubits = len(data["qubits"])
    num_bits = len(data["bits"])
    qc = QuantumCircuit(num_qubits, num_bits)

    qubit_index = {name: i for i, name in enumerate(data["qubits"])}
    bit_index = {name: i for i, name in enumerate(data["bits"])}

    for op in data["operations"]:
        name = op["name"].upper()
        targets = [qubit_index[t] for t in op.get("targets", [])]
        targets = unique_qubits(targets)
        tos = [bit_index[b] for b in op.get("to", [])]
        params = op.get("params", [])

        if name == "H":
            qc.h(targets[0])
        elif name == "X":
            qc.x(targets[0])
        elif name == "Y":
            qc.y(targets[0])
        elif name == "Z":
            qc.z(targets[0])
        elif name == "S":
            qc.s(targets[0])
        elif name == "T":
            qc.t(targets[0])
        elif name in ("CX", "CNOT"):
            qc.cx(targets[0], targets[1])
        elif name == "MEASURE":
            qc.measure(targets[0], tos[0])
        elif name == "RESET":
            qc.reset(targets[0])
        elif name == "RX":
            qc.rx(safe_eval(params[0]), targets[0])
        elif name == "RY":
            qc.ry(safe_eval(params[0]), targets[0])
        elif name == "RZ":
            qc.rz(safe_eval(params[0]), targets[0])
        elif name == "U1":
            qc.u1(safe_eval(params[0]), targets[0])
        elif name == "U2":
            qc.u2(safe_eval(params[0]), safe_eval(params[1]), targets[0])
        elif name == "U3":
            qc.u3(safe_eval(params[0]), safe_eval(params[1]), safe_eval(params[2]), targets[0])
        elif name == "SWAP":
            qc.swap(targets[0], targets[1])
        elif name == "ISWAP":
            qc.iswap(targets[0], targets[1])
        elif name == "CCX":
            qc.ccx(targets[0], targets[1], targets[2])
        elif name == "CSWAP":
            qc.cswap(targets[0], targets[1], targets[2])

    return qc


def draw_circuit_ascii(data):
    qc = from_json_to_qc(data)
    return qc.draw(output="text")


if __name__ == "__main__":
    import sys

    # riceve JSON da stdin
    circuit_json = sys.stdin.read()
    data = json.loads(circuit_json)

    ascii_circuit = draw_circuit_ascii(data)
    print(ascii_circuit)
    sys.stdout.flush()
