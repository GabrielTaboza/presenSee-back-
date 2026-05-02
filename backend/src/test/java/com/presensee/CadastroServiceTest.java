package com.presensee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadastroServiceTest {

    CadastroService service = new CadastroService();

    @Test
    public void testeCadastroValido() {
        boolean resultado = service.cadastrar("Gabriel", "gabriel@email.com", "123456");
        assertTrue(resultado);
    }

    @Test
    public void testeSemNome() {
        boolean resultado = service.cadastrar("", "email@email.com", "123456");
        assertFalse(resultado);
    }

    @Test
    public void testeEmailInvalido() {
        boolean resultado = service.cadastrar("Gabriel", "emailinvalido", "123456");
        assertFalse(resultado);
    }

    @Test
    public void testeSenhaCurta() {
        boolean resultado = service.cadastrar("Gabriel", "email@email.com", "123");
        assertFalse(resultado);
    }
}