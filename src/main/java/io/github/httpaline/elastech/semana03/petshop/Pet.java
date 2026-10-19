package io.github.httpaline.elastech.semana03.petshop;

public class Pet {
    public static final int PESO_MINIMO = 10;
    public static final int PESO_MAXIMO = 25;
    private String nome;
    private String especie;
    private double peso;

    public Pet(String nome, String especie, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    String getPorte(){
        if (peso < PESO_MINIMO) {
            return "Pequeno";
        } else if (peso < PESO_MAXIMO) {
            return "Médio";
        } else {
            return "Grande";
        }
    }
}