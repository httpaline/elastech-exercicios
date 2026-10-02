package io.github.httpaline.elastech.semana01.revisao.ex06;

import java.util.Scanner;

public class Ex06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu Ano de Nascimento:");
        int ano = sc.nextInt();
        sc.nextLine(); //correção buffer

        System.out.println("Digite o seu Nome Completo:");
        String nome = sc.nextLine();

        System.out.println("O usuário " +nome+ " nasceu em " +ano+".");
    }
}
