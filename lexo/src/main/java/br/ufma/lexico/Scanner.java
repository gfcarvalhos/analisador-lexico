package br.ufma.lexico;

import java.util.ArrayList;
import java.util.List;

public class Scanner {
    private String source;

    public Scanner(String source) {
        this.source = source;
    }

    public List<Token> scanTokens (){
        return new ArrayList<>();
    }
}
