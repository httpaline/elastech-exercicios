package io.github.httpaline.elastech.semana01.revisao.ex05;

import java.util.Scanner;

public class Ex05 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        for(int i=1;i<4;i++){
            Produto produto = new Produto();
            System.out.printf("Digite o nome do produto %d\n", i);
            produto.nome = sc.nextLine();
            System.out.printf("Digite o preço do pruduto %d\n", i);
            produto.preco = sc.nextDouble();
            sc.nextLine(); //consome o enter para resolver buffer de teclado.

            if(produto.preco > 100){
                System.out.printf("Produto caro! R$ %.2f\n", produto.preco);
            }else{
                System.out.printf("Produto com preço acessível! R$ %.2f\n", produto.preco);
            }
        }
        sc.close();
    }
}
