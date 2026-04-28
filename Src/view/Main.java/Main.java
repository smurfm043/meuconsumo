package view;

import model.*;
import service.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        UsuarioService usuarioService = new UsuarioService();

        Usuario user = new Usuario(1, "João", "joao@email.com", "Estudante", 1000);
        usuarioService.cadastrarUsuario(user);

        Categoria salario = new Categoria(1, "Salário", "Receita", 0);

        Receita r = new Receita(1, "Salário mês", 3000, LocalDate.now(), salario);

        System.out.println(user);
        System.out.println(r);
    }
}