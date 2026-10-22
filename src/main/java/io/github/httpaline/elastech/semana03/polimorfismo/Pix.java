package io.github.httpaline.elastech.semana03.polimorfismo;

public class Pix implements MeioDePagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado via Pix. Aprovado na hora!%n", valor);
    }
}
