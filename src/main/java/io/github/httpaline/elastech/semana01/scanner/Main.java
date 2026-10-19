package io.github.httpaline.elastech.semana01.scanner;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = Integer.parseInt(sc.nextLine());

        System.out.println("Oi " + nome + ", você tem " + idade + " anos e vai fazer "
                + (idade + 1) + " no próximo aniversário.");

        // -------------------------
        System.out.print("\nDigite o primeiro número: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o segundo número: ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));

        if (b != 0) {
            System.out.println("Divisão: " + (a / b));
            System.out.println("Resto: " + (a % b));
        } else {
            System.out.println("Não é possível dividir por zero.");
        }

        // -------------------------
        System.out.print("\nDigite a nota da aluna: ");
        double nota = Double.parseDouble(sc.nextLine().replace(",", "."));

        if (nota >= 7) {
            System.out.println("Aprovada");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovada");
        }
        // -------------------------

        System.out.print("\nDigite um número: ");
        int numero = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}

