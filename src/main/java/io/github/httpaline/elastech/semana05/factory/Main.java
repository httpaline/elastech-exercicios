package io.github.httpaline.elastech.semana05.factory;

public class Main {
    static void main() {
        Animal animal = AnimalFactory.getAnimal("cachorro");
        Animal animal2 = AnimalFactory.getAnimal("gato");

        animal.emitirSom();
        animal2.emitirSom();
    }
}
