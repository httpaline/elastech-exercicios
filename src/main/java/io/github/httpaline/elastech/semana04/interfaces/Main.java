package io.github.httpaline.elastech.semana04.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        System.out.println("----- 1 -----");
        Cachorro rex = new Cachorro();
        rex.emitirSom();

        System.out.println("\n----- 2 -----");
        Animal bidu = new Cachorro();
        Animal salem = new Gato();
        bidu.emitirSom();
        salem.emitirSom();

        System.out.println("\n----- 3 -----");
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais) {
            animal.emitirSom();
        }

        System.out.println("\n----- 4 -----");
        List<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar("Sua compra foi aprovada!");
        }

        System.out.println("\n----- 5 -----");
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
        }
    }
}