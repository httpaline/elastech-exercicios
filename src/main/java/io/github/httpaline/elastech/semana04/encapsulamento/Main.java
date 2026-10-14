package io.github.httpaline.elastech.semana04.encapsulamento;

public class Main {
    static void main() {
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Ana");
        conta.depositar(500);
        conta.depositar(-100);
        conta.sacar(2000);
        conta.sacar(200);
        System.out.println(conta.getSaldo());

        /*
          produto = new Produto();
          System.out.println(produto.nome);
          System.out.println(produto.preco);
          System.out.println(produto.codigoInterno);
        */

        System.out.println(conta.getNumeroConta());
        conta.setNumeroConta("999-Z");







    }
}
