package io.github.httpaline.elastech.semana05.testes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescontoTest {
    private final CalculadoraDesconto calculadora = new CalculadoraDesconto();

    @Test
    void teste1(){
        double resultado = calculadora.aplicarDesconto(50.0,false);

        assertEquals(50.0,resultado);
    }

    @Test
    void teste2(){
        double resultado = calculadora.aplicarDesconto(200.0,true);

        assertEquals(180,resultado);
    }

    @Test
    void teste3(){
        assertThrows(IllegalArgumentException.class, () -> calculadora.aplicarDesconto(-10, false));
    }
}