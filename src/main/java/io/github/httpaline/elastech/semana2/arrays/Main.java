package io.github.httpaline.elastech.semana2.arrays;

import java.util.Scanner;

public class Main {
    static void main() {
        String[] nome = {"Aline", "Luiza", "Souza", "Adriana", "Angel"};

        System.out.println(nome[0]);
        System.out.println(nome[2]);
        System.out.println(nome[4]);


        int[] nota = {8, 6, 10, 7, 9};
        int soma = 0;
        for(int i=0;i<nota.length;i++){
            System.out.printf("Nota %d = %d\n", i, nota[i]);
            soma+=nota[i];
        }
        System.out.printf("Soma: %d\n", soma);
        System.out.printf("Media: %d", soma/nota.length);
        System.out.println("\n");


        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0;i<num.length;i++){
            System.out.printf("Digite o número %d:", i);
            num[i] = sc.nextInt();
        }
        for(int i=num.length-1;i>=0;i--){
            System.out.printf("%d", num[i]);
        }



    }
}
