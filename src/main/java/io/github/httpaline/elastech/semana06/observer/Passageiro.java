package io.github.httpaline.elastech.semana06.observer;

public class Passageiro implements ObservadorVoo {
    @Override
    public void atualizar(String status) {
        System.out.println("Passageiro avisado: "+status);
    }
}
