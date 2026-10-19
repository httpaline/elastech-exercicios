package io.github.httpaline.elastech.semana04.revisao;

public abstract class Forma {
    String nome;

     public Forma (String nome){
        this.nome=nome;
    }

    public void exibirNome(){
        System.out.println(nome);
    }

    public abstract double calcularArea();

}
