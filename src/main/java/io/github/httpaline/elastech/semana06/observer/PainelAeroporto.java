package io.github.httpaline.elastech.semana06.observer;

public class PainelAeroporto implements ObservadorVoo{
    @Override
    public void atualizar(String status) {
        System.out.println("Painel: "+status);
    }
}
