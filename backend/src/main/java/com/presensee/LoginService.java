package com.presensee;

public class LoginService {

    public boolean login(String email, String senha) {

        String emailCorreto = "admin@email.com";
        String senhaCorreta = "123456";

        if (email.equals(emailCorreto) && senha.equals(senhaCorreta)) {
            return true;
        }

        return false;
    }
}