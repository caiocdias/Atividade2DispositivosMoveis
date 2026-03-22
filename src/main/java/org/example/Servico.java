package org.example;

public class Servico extends Produto {
    private double valorHora;

    public Servico() {
    }

    public Servico(int codigo, String nome, double valorHora) {
        super(codigo, nome);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
