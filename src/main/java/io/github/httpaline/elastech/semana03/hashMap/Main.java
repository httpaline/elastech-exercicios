package io.github.httpaline.elastech.semana03.hashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static void main() {
        Map<String,Integer> idades = new HashMap<>();
        idades.put("Aline",25);
        idades.put("Adriana",55);
        idades.put("Angel",21);

        System.out.println(idades);
        System.out.println(idades.get("Aline"));

        //------------------------------------------

        Map<String,Double> produtos = new HashMap<>();
        produtos.put("Café",5.00);
        System.out.println(produtos);
        produtos.put("Café",7.50);
        System.out.println(produtos);

        //------------------------------------------

        Map<String,String> telefones = new HashMap<>(Map.of(
                "Aline","1234567891",
                "Adriana","2134567890"
        ));

        String alguem = "Aline";
        if(telefones.containsKey(alguem)){
            System.out.println("O telefone "+telefones.get(alguem)+" está na agenda");
        }else {
            System.out.println("O telefone "+telefones.get(alguem)+" não está na agenda");
        }

        //------------------------------------------

        Map<String,Integer> produtos2 = new HashMap<>(Map.of(
                "Coxinha",5,
                "Pão de queijo",10
        ));

        System.out.println(produtos2.getOrDefault("Coxinha",0));
        System.out.println(produtos2.getOrDefault("Enroladinho",0));
        System.out.println(produtos2.get("Enroladinho"));

        //------------------------------------------

        Map<String,Double> notas = new HashMap<>(Map.of(
                "Aline",10.0,
                "Maria",9.5,
                "Angel",10.0
        ));

        System.out.println(notas + " Tamanho "+notas.size());

        notas.remove("Angel");

        System.out.println(notas + " Tamanho "+notas.size());
    }
}
