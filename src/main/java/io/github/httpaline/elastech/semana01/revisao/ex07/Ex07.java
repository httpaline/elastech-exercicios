package io.github.httpaline.elastech.semana01.revisao.ex07;

import java.util.Scanner;

public class Ex07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opcao = 0, contador = 0;

        while(opcao != 3) {
            System.out.println("╭─────────────────────────╮");
            System.out.println("│     Deseja iniciar?     │");
            System.out.println("├─────────────────────────┤");
            System.out.println("│  1 │ Continuar          │");
            System.out.println("│  2 │ Nº de Alunas       │");
            System.out.println("│  3 │ Sair               │");
            System.out.println("╰─────────────────────────╯");
            System.out.print("  ➜ Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Aluna aluna = new Aluna();

                    do {
                        System.out.println("Digite a primeira nota:");
                        aluna.nota1 = sc.nextDouble();

                        if (aluna.nota1 < 0 || aluna.nota1 > 10) {
                            System.out.println("Nota inválida! Por favor digite um número entre 0 e 10");
                        }
                    } while (aluna.nota1 < 0 || aluna.nota1 > 10);

                    do {
                        System.out.println("Digite a segunda nota:");
                        aluna.nota2 = sc.nextDouble();

                        if (aluna.nota2 < 0 || aluna.nota2 > 10) {
                            System.out.println("Nota inválida! Por favor digite um número entre 0 e 10");
                        }

                    } while (aluna.nota2 < 0 || aluna.nota2 > 10);

                    sc.nextLine();
                    System.out.println("Digite o nome da Aluna:");
                    aluna.nome = sc.nextLine();

                    aluna.media = (aluna.nota1 + aluna.nota2) / 2;

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    }

                    System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, e sua média final foi %.1f. Aluna %s\n", aluna.nome, aluna.nota1, aluna.nota2, aluna.media, aluna.passou ? "Aprovada!" : "Reprovada");
                    contador++;

                    break;

                case 2:
                    System.out.printf("Quantidade de Alunas: %d\n", contador);
                    break;

                case 3:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
        sc.close();
    }
}