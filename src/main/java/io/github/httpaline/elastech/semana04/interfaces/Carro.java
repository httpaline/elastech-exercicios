package io.github.httpaline.elastech.semana04.interfaces;

public class Carro implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Carro ligado: vrum!");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando na estrada.");
    }
}