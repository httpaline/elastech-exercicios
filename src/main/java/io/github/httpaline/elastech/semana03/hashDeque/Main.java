package io.github.httpaline.elastech.semana03.hashDeque;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Main {
    static void main() {
        Queue<String> pessoas = new ArrayDeque<>();
        pessoas.add("Aline");
        pessoas.add("Adriana");
        pessoas.add("Angel");

        System.out.println(pessoas +" Quantidade: " + pessoas.size());

        //------------------------------------------

        Queue<String> fila = new ArrayDeque<>(List.of("um","dois","tres"));

        fila.peek();
        System.out.println(fila);

        //------------------------------------------

        fila.poll();
        System.out.println(fila);

        //------------------------------------------

        Queue<String> nomes = new ArrayDeque<>(List.of("Bia","Adriana","Zoe"));

        while(!nomes.isEmpty()){
            nomes.poll();
            System.out.println(nomes);
        }
        System.out.println("Fila vazia.");

        //------------------------------------------
        Queue<String> nomes2 = new ArrayDeque<>(List.of("Bia","Adriana","Zoe"));

        System.out.println("Bia está na fila? "+(nomes2.contains("Bia")?"Está":"Não está"));
        System.out.println("Zoe está na fila? "+(nomes2.contains("Zoe")?"Está":"Não está"));

        //------------------------------------------

        Queue<String> nomes3 = new ArrayDeque();
        nomes3.add("João");
        if(!nomes3.isEmpty()){
            System.out.println("Próximo:["+nomes3.peek()+"]");
        }else{
            System.out.println("Não tem ninguem na fila");
        }


    }
}
