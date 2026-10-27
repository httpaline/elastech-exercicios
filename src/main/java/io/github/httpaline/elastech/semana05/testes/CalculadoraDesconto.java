package io.github.httpaline.elastech.semana05.testes;

public class CalculadoraDesconto {
    public double aplicarDesconto(double valorCompra, boolean clientVip){
        if(valorCompra <= 0){
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }

        if(clientVip){
            return valorCompra * 0.90;
        }

        return valorCompra;
    }
}
