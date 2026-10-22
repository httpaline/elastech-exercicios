package io.github.httpaline.elastech.semana05.factory;

public class AnimalFactory {

    public static Animal getAnimal(String tipo) {
        return switch (tipo.toUpperCase()){
            case "CACHORRO" -> new Cachorro();
            case "GATO" -> new Gato();
            default -> throw new IllegalArgumentException("Animal inválido: "+tipo);

        };
    }
}
