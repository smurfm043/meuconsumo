package model;

import java.time.LocalDate;

public abstract class Movimentacao {
    private int id;
    private String descricao;
    private double valor;
    private LocalDate data;
    private Categoria categoria;

    public Movimentacao(int id, String descricao, double valor, LocalDate data, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
    }

    public abstract double calcularImpacto();

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descricao + " - R$" + valor;
    }
}