package io.github.httpaline.elastech.semana03.polimorfismo;

public class Painel {
    void exibir(String valor) {
        System.out.println("Recebi um texto (String): " + valor);
    }

    void exibir(int valor) {
        System.out.println("Recebi um número inteiro (int): " + valor);
    }

    void exibir(boolean valor) {
        System.out.println("Recebi um valor lógico (boolean): " + valor);
    }

    void exibir(double valor) {
        System.out.println("Recebi um número decimal (double): " + valor);
    }
}
