package model;

import java.time.LocalDate;

public class Despesa extends Movimentacao {

    public Despesa(int id, String descricao, double valor, LocalDate data, Categoria categoria) {
        super(id, descricao, valor, data, categoria);
    }

    @Override
    public double calcularImpacto() {
        return -getValor();
    }
}