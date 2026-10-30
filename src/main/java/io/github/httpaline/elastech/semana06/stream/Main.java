package io.github.httpaline.elastech.semana06.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    static void main() {
        List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,6));
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(pares);

        List<String> frutas = new ArrayList<>(List.of("amora","banana","maça","morango","uva"));
        List<String> frutasMaiusculo = frutas.stream()
                    .map(f -> f.toUpperCase())
                    .toList();
        System.out.println(frutasMaiusculo);

        List<String> cidades = new ArrayList<>(List.of("Rio Paranaíba","Belo Horizonte","Carmésia","São Gotardo","Marmelópolis"));
        List<String> cidadesComS = cidades.stream()
                .filter(c -> c.startsWith("S"))
                .toList();
        System.out.println(cidadesComS);

    }
}
