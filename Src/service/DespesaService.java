package service;

import model.Despesa;
import java.util.ArrayList;

public class DespesaService {
    private ArrayList<Despesa> despesas = new ArrayList<>();

    public void adicionarDespesa(Despesa d) {
        despesas.add(d);
    }

    public ArrayList<Despesa> listarDespesas() {
        return despesas;
    }
}