package io.github.httpaline.elastech.semana04.interfaces;

public class Moto implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Moto ligada: ratatá!");
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando entre os carros.");
    }
}