package io.github.httpaline.elastech.semana03.polimorfismo;

public class Boleto implements MeioDePagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Boleto de R$ %.2f gerado. Compensação em até 3 dias úteis.%n", valor);
    }
}
