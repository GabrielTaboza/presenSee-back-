package com.presensee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {

    LoginService service = new LoginService();

    @Test
    public void testeLoginCorreto() {
        boolean resultado = service.login("admin@email.com", "123456");
        assertTrue(resultado);
    }

    @Test
    public void testeEmailErrado() {
        boolean resultado = service.login("errado@email.com", "123456");
        assertFalse(resultado);
    }

    @Test
    public void testeSenhaErrada() {
        boolean resultado = service.login("admin@email.com", "senhaerrada");
        assertFalse(resultado);
    }
}