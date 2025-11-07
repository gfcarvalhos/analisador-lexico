package br.ufma.lexico;

abstract class Expr {
    interface Visitor<R>{}

    <R> R accept(Visitor<R> visitor) {
        return (R) visitor;
    }

    class Binary {}
}
