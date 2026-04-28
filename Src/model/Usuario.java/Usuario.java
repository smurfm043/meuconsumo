package model;

import java.util.ArrayList;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String profissao;
    private double metaEconomia;

    private ArrayList<Receita> receitas;
    private ArrayList<Despesa> despesas;

    public Usuario(int id, String nome, String email, String profissao, double metaEconomia) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.profissao = profissao;
        this.metaEconomia = metaEconomia;
        this.receitas = new ArrayList<>();
        this.despesas = new ArrayList<>();
    }

    public double calcularSaldo() {
        double total = 0;
        for (Receita r : receitas) total += r.getValor();
        for (Despesa d : despesas) total -= d.getValor();
        return total;
    }

    // Getters e Setters
    public int getId() { return id; }
    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    @Override
    public String toString() {
        return "Usuario: " + nome + " | Saldo: " + calcularSaldo();
    }
}