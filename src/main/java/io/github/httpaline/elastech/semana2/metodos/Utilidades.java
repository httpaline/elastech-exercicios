package io.github.httpaline.elastech.semana2.metodos;

public class Utilidades {
    static void saudar(String nome){
        System.out.printf("Olá %s! Tudo bem?\n", nome);
    }

    static int dobro(int numero){
        numero *= 2;
        return numero;
    }

    static double media(double n1, double n2){
        return (n1+n2)/2;
    }

    static boolean ehMaiorDeIdade(int idade){
        if(idade>=18){
            return true;
        }else {
            return false;
        }
    }

    static int somar(int num1, int num2){
        return num1+num2;
    }

    static int somar(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    static double somar(double num1, double num2){
        return num1+num2;
    }

    static void saudacao() {
        System.out.println("Olá!");
    }

    static void saudacao(String nome) {
        System.out.printf("Olá, %s!%n", nome);
    }
}
