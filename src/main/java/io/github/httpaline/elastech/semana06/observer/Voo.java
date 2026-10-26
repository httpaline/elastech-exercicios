package io.github.httpaline.elastech.semana06.observer;

import java.util.ArrayList;

public class Voo {
    ArrayList<ObservadorVoo> lista = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o) {
        lista.add(o);
    }

    public void mudarStatus(String status) {
        for(ObservadorVoo observador : lista){
            observador.atualizar(status);
        }
    }




}
