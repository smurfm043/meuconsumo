package service;

import model.Receita;
import java.util.ArrayList;

public class ReceitaService {
    private ArrayList<Receita> receitas = new ArrayList<>();

    public void adicionarReceita(Receita r) {
        receitas.add(r);
    }

    public ArrayList<Receita> listarReceitas() {
        return receitas;
    }
}