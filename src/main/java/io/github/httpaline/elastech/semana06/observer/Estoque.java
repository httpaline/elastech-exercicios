package io.github.httpaline.elastech.semana06.observer;

import java.util.ArrayList;

public class Estoque {
    ArrayList<ObservadorEstoque> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorEstoque observador){
        observadores.add(observador);
    }

    public void setQuantidade(int quantidade){
        for(ObservadorEstoque observador : observadores){
            observador.atualizar(quantidade);
        }
    }
}
