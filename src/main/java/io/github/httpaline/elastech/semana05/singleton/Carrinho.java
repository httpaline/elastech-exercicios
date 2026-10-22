package io.github.httpaline.elastech.semana05.singleton;

public class Carrinho {

    private int quantidadeItens = 0;
    private static Carrinho instancia;

    public static Carrinho getInstancia(){
        if(instancia == null){
            instancia = new Carrinho();
        }
        return instancia;
    }

    public void adicionarItem(){
        quantidadeItens++;
    }

    public int getQuantidadeItens(){
        return quantidadeItens;
    }



}
