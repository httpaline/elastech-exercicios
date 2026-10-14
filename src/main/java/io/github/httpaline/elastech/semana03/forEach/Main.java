package io.github.httpaline.elastech.semana03.forEach;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        String[] nomes = {"Aline","Angelo","Caio","Jessika"};

        for(String nome : nomes){
            System.out.println(nome);
        }
        //------------------------------------------

        List<Double> notas = new ArrayList<>(List.of(5.5,7.5,8.0,10.0,9.5));
        for(double nota : notas){
            System.out.println(nota);
        }

        //------------------------------------------

        int[] notas2 = {8,6,10,7};

        int soma = 0;
        for(int nota : notas2){
            soma+=nota;
        }
        System.out.println("Soma: "+soma);
        System.out.println("Média: "+soma/notas2.length);

        //------------------------------------------

        int total = 0;
        for(String nome : nomes){
            if(nome.length()>5){
                total+=1;
            }
        }
        System.out.println("Total de nomes com mais de 5 letras: "+total);

        //------------------------------------------

        for(int i=0;i< nomes.length;i++){
            System.out.println(nomes[i]);
        }


    }
}
