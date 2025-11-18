# JLox — Interpretador da Linguagem Lox

**Disciplina:** Compiladores — Universidade Federal do Maranhão (UFMA)

**Desenvolvido por:**

- André Moura Lima - Github: [AndreMouraL](https://github.com/AndreMouraL)
- Gabriel Felipe Carvalho Silva - Github: [gfcarvalhos](https://github.com/gfcarvalhos)
---

## 📖 Sobre o Projeto

JLox é um interpretador para a linguagem de programação **Lox**, implementado em **Java** seguindo o livro *Crafting Interpreters* de Robert Nystrom. O projeto cobre as fases principais de um interpretador: análise léxica, análise sintática, checagem semântica básica e execução.

O objetivo é aplicar conceitos teóricos de compiladores na prática e servir como material didático para a disciplina de Compiladores da UFMA.

---

## 🎯 Funcionalidades

### ✅ Implementadas (FASE 1)

* Análise léxica (Scanner) com suporte a tokens.
* Análise sintática (Parser) — parser recursivo descendente.
* Expressões aritméticas, lógicas e agrupamento.
* Declarações: variáveis, `print`, e expressões.
* Ambiente e escopo léxico com ambientes encadeados.
* Estruturas de controle: `if/else`, `while`, `for`.
* Operadores lógicos (`and`, `or`).
* Blocos e controle de escopo.
* Interpretador/Executor básico e sistema de tipos dinâmico.

### 🔄 Em desenvolvimento (FASE 2)

* Funções e *closures*.
* Classes, herança e polimorfismo (orientação a objetos).
* Tratamento de erros mais robusto.
* Coletor de lixo.
* Otimizações de desempenho.

---

## 🏗️ Arquitetura do Projeto

```
src/br/ufma/jlox/
├── Lox.java              # Ponto de entrada
├── Scanner.java          # Analisador léxico
├── Parser.java           # Analisador sintático
├── Interpreter.java      # Interpretador/Executor
├── Environment.java      # Ambiente de variáveis
├── Expr.java             # Estrutura de expressões (AST)
├── Stmt.java             # Estrutura de declarações (AST)
├── Token.java            # Representação de tokens
├── TokenType.java        # Enum de tipos de token
└── tool/
    └── GenerateAst.java  # Gerador de AST (ferramenta)
```

---

## 🚀 Como Executar

### Pré-requisitos

* Java JDK 8 ou superior
* Git

### Passos

1. Clonar o repositório:

```bash
git clone https://github.com/seu-usuario/jlox-ufma.git
cd jlox-ufma
```

2. Compilar o projeto:

```bash
javac -d bin src/br/ufma/jlox/*.java src/br/ufma/jlox/tool/*.java
```

3. Executar o interpretador:

* Modo REPL (interativo):

```bash
java -cp bin br.ufma.jlox.Lox
```

* Executar um arquivo Lox:

```bash
java -cp bin br.ufma.jlox.Lox exemplos/meu_programa.lox
```

* Gerar AST (ferramenta de desenvolvimento):

```bash
java -cp bin br.ufma.jlox.tool.GenerateAst src/br/ufma/jlox/
```

---

## 📋 Exemplos de Código (Lox)

### Hello World

```lox
print "Hello, World!";
```

### Variáveis e Expressões

```lox
var a = 10;
var b = 20;
print a + b; // 30
```

### Estruturas de Controle

```lox
// If/else
if (true) {
  print "Verdadeiro";
} else {
  print "Falso";
}

// Loop while
var i = 0;
while (i < 5) {
  print i;
  i = i + 1;
}

// Loop for
for (var j = 0; j < 3; j = j + 1) {
  print j;
}
```

### Fibonacci

```lox
var a = 0;
var temp;
for (var b = 1; a < 100; b = temp + b) {
  print a;
  temp = a;
  a = b;
}
```

---

## 🎯 Próximos Passos

* Implementar declaração e chamada de funções.
* Adicionar suporte a classes e objetos.
* Melhorar desempenho do interpretador.
* Expandir biblioteca padrão com funções *built-in*.
* Escrever documentação completa (guia do usuário e referência da linguagem).

---

## 🐛 Reportar Problemas

Se encontrar um bug, por favor abra uma *issue* no GitHub incluindo:

* Descrição do problema
* Código que reproduz o erro
* Mensagem de erro (se houver)
* Ambiente (SO, versão do Java)

---

## 📄 Licença

Projeto desenvolvido para fins educacionais como parte da disciplina de Compiladores — UFMA.

---

*Desenvolvido com 💻 pela equipe de Compiladores - UFMA 2025*

