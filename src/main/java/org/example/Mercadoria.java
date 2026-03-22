package org.example;

public class Mercadoria extends Produto {
    private double peso;

    public Mercadoria() {
    }

    public Mercadoria(int codigo, String nome, double peso) {
        super(codigo, nome);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
