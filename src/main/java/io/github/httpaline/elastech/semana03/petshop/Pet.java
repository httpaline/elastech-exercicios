package io.github.httpaline.elastech.semana03.petshop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;

    String definirPorte(){
        if (peso < 10) {
            return "Pequeno";
        } else if (peso < 25) {
            return "Médio";
        } else {
            return "Grande";
        }
    }
}
