package io.github.httpaline.elastech.semana06.observer;

public class RegistroEstoque implements ObservadorEstoque{
    @Override
    public void atualizar(int quantidade) {
        System.out.println("Nova quantidade: " + quantidade);
    }
}
