package io.github.httpaline.elastech.semana05.construtores;

public class Main {
    static void main() {
        Agendamento a = new Agendamento("Thor", "banho", "14h",
                true, true, false, "alérgico a shampoo", 0.10);

        Agendamento b = new Agendamento("Luna", "tosa", "10h",
                false, false, false, "", 0.0);

        Agendamento c = new Agendamento("Mel", "banho", "16h",
                false, false, true, "", 0.0);

        a.mostrar();
        b.mostrar();
        c.mostrar();
    }
}
