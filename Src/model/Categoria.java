package model;

public class Categoria {
    private int id;
    private String nome;
    private String tipo;
    private double limiteMensal;

    public Categoria(int id, String nome, String tipo, double limiteMensal) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.limiteMensal = limiteMensal;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " (" + tipo + ")";
    }
}