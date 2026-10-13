package io.github.httpaline.elastech.semana3.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        //1
        ArrayList nomes = new ArrayList();
        nomes.add("Maria");
        nomes.add("Aline");
        nomes.add("Angel");
        System.out.println(nomes);

        //2
        ArrayList frutas = new ArrayList(List.of("Abacaxi", "Pêssego", "Morango","Abacate"));
        System.out.println("Primeira fruta: " + frutas.get(0));
        System.out.println("Última fruta: " + frutas.get(3));
        System.out.println("Número de frutas: " + frutas.size());

        //3
        ArrayList nome = new ArrayList(List.of("Mari", "Neto", "Adriana","Angel"));
        System.out.println(nome);
        nome.set(2,"Aline");
        System.out.println(nome);

        //4
        ArrayList cidades = new ArrayList(List.of("Beagá", "Rio Paranaíba", "Ouro Preto","Diamantina"));
        cidades.remove(1);
        System.out.println(cidades);

        //5
        ArrayList nomes1 = new ArrayList(List.of("Mari", "Neto", "Adriana","Angel","Maria", "Jessika"));
        for(int i=0;i<nomes1.size();i++){
            System.out.println(i+": "+nomes1.get(i));
        }

        //6
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String n1 = sc.nextLine();

        if(nomes1.contains(n1)){
            System.out.println("Está na lista!");
        }else{
            System.out.println("Não está na lista.");
        }










    }
}
