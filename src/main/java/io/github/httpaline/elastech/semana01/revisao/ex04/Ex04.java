package io.github.httpaline.elastech.semana01.revisao.ex04;

import java.sql.SQLOutput;

public class Ex04 {
    static void main() {
        Pet gato = new Pet();
        Pet cachorro = new Pet();

        gato.nome = "Sr Meia noite";
        gato.raca = "dessa cor eu não tenho";
        gato.peso = 5;

        cachorro.nome = "Totoro";
        cachorro.raca = "Salsichinha";
        cachorro.peso = 9;

        System.out.println(gato.nome + " é da raça " + gato.raca + " e pesa " + gato.peso + " kg.");
        System.out.println(cachorro.nome + " é da raça " + cachorro.raca + " e pesa " + cachorro.peso + " kg.");
    }
}
