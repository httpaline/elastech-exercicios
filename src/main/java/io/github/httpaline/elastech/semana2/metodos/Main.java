package io.github.httpaline.elastech.semana2.metodos;

import java.util.Scanner;

public class Main {
    static void main() {
        mostrarBoasVindas();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        Utilidades.saudar(nome);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        System.out.printf("O dobro é: %d\n", Utilidades.dobro(numero));

        System.out.println("Digite um número:");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número:");
        int n2 = sc.nextInt();
        System.out.println("Média = " + Utilidades.media(n1,n2));

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        if(Utilidades.ehMaiorDeIdade(idade)){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Você é menor de idade!");
        }

        System.out.println(Utilidades.somar(2, 3));
        System.out.println(Utilidades.somar(2, 3, 4));
        System.out.println(Utilidades.somar(2.5, 1.5));

        Utilidades.saudacao();
        Utilidades.saudacao("Aline");


    }

    static void mostrarBoasVindas(){
        System.out.println("Bem-vinda ao curso de Java!");
    }

}