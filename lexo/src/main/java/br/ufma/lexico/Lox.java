package br.ufma.lexico;

import java.io.IOException;

public class Lox {
    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            System.out.println("Usage: jlox [script");
        } else if (args.length == 1) {
            runFile(args[0]);
        } else {
            runPrompt();
        }
    }

    public static void runFile(String e) {
        System.out.println("runFile function");
    }

    public static void runPrompt(){
        System.out.println("runPrompt function");
    }
}
