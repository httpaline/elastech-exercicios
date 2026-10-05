package io.github.httpaline.elastech.semana02.tratamentoExceções;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static void main() {
        //1
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int a = sc.nextInt();

        System.out.println("Digite outro número:");
        int b = sc.nextInt();

        try {
            System.out.println("Divisão = "+ a/b);
        }catch (ArithmeticException ae){
            System.out.println("Não se divide por 0.");
        }

        //2
        double[] notas = {5, 7, 5, 8, 9};
        System.out.println("Digite uma posição:");
        int posicao = sc.nextInt();

        try {
            System.out.printf("Nota: %f", notas[posicao]);
        }catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Posição invalida! O array vai de 0 a 4.");
        }

        //3
        System.out.println("Digite sua idade:");

        try {
            int idade = sc.nextInt();
        }catch (InputMismatchException ime){
            System.out.println("O valor digitado deve ser um número inteiro.");
            sc.nextLine();
        }

        //4
        String nome = null;
        try {
            System.out.println(nome.length());
        }catch (NullPointerException npe){
            System.out.println("O nome não foi preenchido.");
        }

        //5
        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        try {
            System.out.println("O resto da divisão é:" + 100%numero);
        }catch (ArithmeticException ae){
            System.out.println("Digite um valor maior que 0.");
        }

        //6
        String[] nomes = {"Aline", "Mari", "Neto"};
        try {
            System.out.println(nomes[5]);
        }catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Essa posição não existe.");
        }
        System.out.println("O programa continua funcionando.");
        sc.close();
    }
}
