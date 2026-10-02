package io.github.httpaline.elastech.semana2.strings;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome completo:");
        String nome = sc.nextLine();

        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.charAt(0));

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();
        System.out.println("Digite uma palavra:");
        String palavra = sc.nextLine();

        System.out.printf("A palavra aparece na frase? %b\n", frase.contains(palavra));

        System.out.println("Digite seu nome:");
        String nome1 = sc.nextLine();
        System.out.println("Digite outra vez:");
        String nome2 = sc.nextLine();

        System.out.printf("Os nomes são iguais? %b ", nome1.equals(nome2));

    }
}
