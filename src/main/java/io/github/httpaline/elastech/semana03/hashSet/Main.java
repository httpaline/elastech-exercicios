package io.github.httpaline.elastech.semana03.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static void main() {
        Set<String> nomes = new HashSet<>();

        nomes.add("Aline");
        nomes.add("Angel");
        nomes.add("Coraline");
        nomes.add("Coraline");

        System.out.println(nomes);
        System.out.println(nomes.size());

        //------------------------------------------

        Set<String> cores = new HashSet<>();
        cores.addAll(List.of("Verde","Vermelho","Azul"));

        if(cores.contains("Verde")){
            System.out.println("Está na lista!");
        }

        //------------------------------------------

        List<String> nome = new ArrayList(List.of("Aline", "Luiza", "Aline", "Souza"));

        System.out.println(nome);

        Set<String> semRepetidos = new HashSet<>(nome);

        System.out.println(semRepetidos);

        //------------------------------------------

        Set<String> cpfs = new HashSet<>(List.of("123.456.789-01","123.456.789-02","123.456.789-03"));
        System.out.println(cpfs);
        cpfs.remove("123.456.789-01");
        System.out.println(cpfs + " Tamanho: "+cpfs.size());

        //------------------------------------------

        Set<String> frutas = new HashSet<>(List.of("Banana","Morango","Abacaxi"));
        for(String fruta:frutas){
            System.out.println(fruta);
        }

        //------------------------------------------

        Set<Integer> vazio = new HashSet<>();
        System.out.println(vazio.isEmpty());
        vazio.add(15);
        System.out.println(vazio.isEmpty());
    }

}
