package io.github.httpaline.elastech.semana03.petshop;

import java.util.Scanner;

public class Entrada {
    private final Scanner sc = new Scanner(System.in);

    public String lerTexto(String mensagem){
        System.out.println(mensagem);
        return sc.nextLine();
    }

    public int lerInteiro(String mensagem){
        while (true) {
            try {
                return Integer.parseInt(lerTexto(mensagem));
            }catch (NumberFormatException nfe){
                System.out.println("Digite apenas números!");
            }
        }
    }

    public Double lerDecimal(String mensagem){
        while (true) {
            try {
                return Double.parseDouble(lerTexto(mensagem).replace(",","."));
            }catch (NumberFormatException nfe){
                System.out.println("Digite um número válido");
            }
        }
    }

    public void fechar(){
        sc.close();
    }
}
