package model;

import java.time.LocalDate;

public class Receita extends Movimentacao {

    public Receita(int id, String descricao, double valor, LocalDate data, Categoria categoria) {
        super(id, descricao, valor, data, categoria);
    }

    @Override
    public double calcularImpacto() {
        return getValor();
    }
}