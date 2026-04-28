package service;

import model.Usuario;
import java.util.ArrayList;

public class UsuarioService {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public ArrayList<Usuario> listarUsuarios() {
        return usuarios;
    }
}