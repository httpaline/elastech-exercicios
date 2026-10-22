package io.github.httpaline.elastech.semana05.builder;

public class Main {
    static void main() {
        Agendamento thor = new Agendamento.Builder("Thor", "banho", "14h")
                .comPerfume()
                .comLaco()
                .observacao("alérgico a shampoo")
                .desconto(0.10)
                .build();

        Agendamento luna = new Agendamento.Builder("Luna", "tosa", "10h")
                .build();

        Agendamento mel = new Agendamento.Builder("Mel", "banho", "16h")
                .comHidratacao()
                .build();

        thor.mostrar();
        luna.mostrar();
        mel.mostrar();
    }
}
