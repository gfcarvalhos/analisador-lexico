package br.ufma.lexico;

import java.util.ArrayList;
import java.util.List;

import static br.ufma.lexico.TokenType.*;

public class Scanner {
    private final String source;
    private final List<Token> tokens = new ArrayList<>();
    
    // Campos adicionados conforme seção 4.4 
    private int start = 0; 
    private int current = 0;  
    private int line = 1;   

    public Scanner(String source) {
        this.source = source;
    }

    // Método scanTokens() conforme seção 4.4
    public List<Token> scanTokens() {
        while (!isAtEnd()) {
            // We are at the beginning of the next lexeme.
            start = current;
            scanToken();
        }

        tokens.add(new Token(EOF, "", null, line));
        return tokens;
    }

    private boolean isAtEnd() {
        return current >= source.length();
    }

    
    private void scanToken() {
       
    }

   
    private char advance() {
        current++;
        return source.charAt(current - 1);
    }
}
//Conclusão do Analisador Léxico – Interpretador Lox