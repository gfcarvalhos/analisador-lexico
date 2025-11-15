package br.ufma.jlox;

import java.util.List;

public class TesteScanner {
    public static void main(String[] args) {
        String source = String.join("\n",
            "// === Teste de tokens simples ===",
            "( ) { } , . - + ; * / ",
            "",
            "// === Teste de operadores duplos ===",
            "! !=",
            "= ==",
            "< <=",
            "> >=",
            "",
            "// === Teste de literais ===",
            "\"string simples\"",
            "\"multi",
            "linha\"",
            "123",
            "45.67",
            "",
            "// === Teste de identificadores e palavras-chave ===",
            "and class else false for fun if nil or",
            "print return super this true var while",
            "minhaVariavel outro_nome _interno Valor123",
            "",
            "// === Teste com espaços, tabs e novas linhas ===",
            "var x = 10;",
            "var y = x + 20;",
            "print y;",
            "",
            "// === Teste de comentários ===",
            "print \"teste comentario\"; // Isso é um comentário",
            "// comentário isolado"
        );

        Scanner scanner = new Scanner(source);
        List<Token> tokens = scanner.scanTokens();

        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}

