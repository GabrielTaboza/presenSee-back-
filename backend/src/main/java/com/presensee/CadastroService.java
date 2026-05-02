package com.presensee;

public class CadastroService {

    public boolean cadastrar(String nome, String email, String senha) {

        if (nome == null || nome.equals("")) {
            return false;
        }

        if (email == null || !email.contains("@")) {
            return false;
        }

        if (senha == null || senha.length() < 6) {
            return false;
        }

        return true;
    }
}