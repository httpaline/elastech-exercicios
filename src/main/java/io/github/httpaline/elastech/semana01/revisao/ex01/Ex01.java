package io.github.httpaline.elastech.semana01.revisao.ex01;

import java.util.Scanner;

public class Ex01 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do lanche:");
        String nomeLanche = sc.nextLine();
        System.out.println("Digite o valor do lanche");
        double valorLanche = sc.nextDouble();

        if(valorLanche > 30){
            valorLanche -= 5;
            System.out.println("★ Desconto aplicado ★");
        }

        System.out.printf("O lanche " + nomeLanche + " custa R$ %.2f\n", valorLanche);
        sc.close();
    }
}
