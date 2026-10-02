package io.github.httpaline.elastech.semana01.revisao.ex03;

import java.util.Scanner;

public class Ex03 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("╭─────────────────────────╮");
            System.out.println("│    ★ LOJA ELASTECH ★    │");
            System.out.println("├─────────────────────────┤");
            System.out.println("│  1 │ Ver camisas        │");
            System.out.println("│  2 │ Ver calças         │");
            System.out.println("│  3 │ Sair               │");
            System.out.println("╰─────────────────────────╯");
            System.out.print("  ➜ Escolha uma opção: ");


            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você selecionou a opção 1: Ver camisas.");
                    break;
                case 2:
                    System.out.println("Você selecionou a opção 2: Ver calças.");
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }while (opcao != 3);

        sc.close();
    }
}
