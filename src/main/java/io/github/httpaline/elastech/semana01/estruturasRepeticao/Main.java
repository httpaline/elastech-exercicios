package io.github.httpaline.elastech.semana01.estruturasRepeticao;

public class Main {
    static void main() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i);
        }

        // ------------------------------------------------------------
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Fim!");

        // ------------------------------------------------------------
        System.out.println();
        int contador = 1;
        while (contador <= 30) {
            System.out.println(contador);
            contador++;
        }

        // ------------------------------------------------------------
        System.out.println();
        int numero = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
