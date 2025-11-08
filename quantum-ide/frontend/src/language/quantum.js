// src/language/quantum.js

export function registerQuantumLanguage(monaco) {
  monaco.languages.register({ id: "quantum" });


  monaco.editor.defineTheme("quantum-dark", {
    base: "vs-dark", 
    inherit: true,   
    rules: [
      { token: "keyword", foreground: "C586C0", fontStyle: "bold" },
      { token: "number", foreground: "B5CEA8" },
      { token: "string", foreground: "CE9178" },
      { token: "comment", foreground: "6A9955", fontStyle: "italic" },
      { token: "operator", foreground: "D4D4D4" },
      { token: "identifier", foreground: "9CDCFE" }
    ],
    colors: {
      "editor.background": "#1E1E1E", 
      "editor.foreground": "#c0c0c0ff",
      'editorError.foreground': '#FF0000', // rosso
    }
  });

  monaco.languages.setMonarchTokensProvider("quantum", {
    keywords: [
      "QUBIT", "REGISTER", "MEASURE", "RESET",
      "H", "X", "Y", "Z", "CNOT", "CX", "CY", "CZ",
      "RX", "RY", "RZ", "S", "T", "SWAP", "ISWAP",
      "CCX", "CSWAP", "U1", "U2", "U3",
      "PI", "E", "SQRT2", "true", "false",
      "if", "else", "while", "for", "return", "break", "continue",
      "gate", "func", "BIT", "INT", "FLOAT"
    ],
    ignoreCase: true,

    operators: [
      "=", "->", "+", "-", "*", "/", "^", "%",
      "&&", "||", "!", "==", "!=", "<", ">", "<=", ">="
    ],

    symbols: /[=><!~?:&|+\-*\/\^%]+/,

    escapes: /\\(?:[btnfr"\'\\]|u[0-9A-Fa-f]{4})/,

    tokenizer: {
      root: [
        // Identifiers and key words
        [/[a-zA-Z_]\w*/, {
          cases: {
            "@keywords": "keyword",
            "@default": "identifier"
          }
        }],

        // Numbers
        [/\d*\.\d+([eE][\-+]?\d+)?/, "number.float"],
        [/\d+/, "number"],

        // Strings e chars
        [/"/, { token: "string.quote", bracket: "@open", next: "@string" }],
        [/'/, { token: "string.quote", bracket: "@open", next: "@char" }],

        // Comments
        [/\/\/.*$/, "comment"],
        [/\/\*/, "comment", "@comment"],

        // Operators
        [/@symbols/, {
          cases: {
            "@operators": "operator",
            "@default": ""
          }
        }],

        // Punctuation
        [/[;,.]/, "delimiter"],
        [/[{}()\[\]]/, "@brackets"]
      ],

      comment: [
        [/[^\/*]+/, "comment"],
        [/\*\//, "comment", "@pop"],
        [/[\/*]/, "comment"]
      ],

      string: [
        [/[^\\"]+/, "string"],
        [/@escapes/, "string.escape"],
        [/\\./, "string.escape.invalid"],
        [/"/, { token: "string.quote", bracket: "@close", next: "@pop" }]
      ],

      char: [
        [/[^\\']+/, "string"],
        [/@escapes/, "string.escape"],
        [/\\./, "string.escape.invalid"],
        [/'/, { token: "string.quote", bracket: "@close", next: "@pop" }]
      ]
    }
  });

  // Configurations (auto closing, comments, ecc.)
  monaco.languages.setLanguageConfiguration("quantum", {
    comments: {
      lineComment: "//",
      blockComment: ["/*", "*/"]
    },
    brackets: [
      ["{", "}"],
      ["[", "]"],
      ["(", ")"]
    ],
    autoClosingPairs: [
      { open: "{", close: "}" },
      { open: "[", close: "]" },
      { open: "(", close: ")" },
      { open: '"', close: '"' },
      { open: "'", close: "'" }
    ]
  });

  // self completion
  monaco.languages.registerCompletionItemProvider("quantum", {
    triggerCharacters: "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""),
    provideCompletionItems: () => {
      const suggestions = [
        ...[
          "QUBIT", "REGISTER", "MEASURE", "RESET",
          "H", "X", "Y", "Z", "CNOT", "CX", "CY", "CZ",
          "RX", "RY", "RZ", "S", "T", "SWAP", "ISWAP",
          "CCX", "CSWAP", "U1", "U2", "U3",
          "PI", "E", "SQRT2",
          "true", "false",
          "if", "else", "while", "for", "return", "break", "continue",
          "gate", "func", "BIT", "INT", "FLOAT"
        ].map(k => ({
          label: k,
          kind: monaco.languages.CompletionItemKind.Keyword,
          insertText: k
        }))
      ];
      return { suggestions };
    }
  });
}
