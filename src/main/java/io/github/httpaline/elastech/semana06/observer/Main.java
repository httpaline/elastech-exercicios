package io.github.httpaline.elastech.semana06.observer;

public class Main {
    static void main() {
        Voo voo = new Voo();
        voo.adicionarObservador(new Passageiro());
        voo.mudarStatus("Embarque iniciado.");
        voo.adicionarObservador(new PainelAeroporto());
        voo.mudarStatus("Atrasado.");

        RegistroEstoque registro = new RegistroEstoque();
        registro.atualizar(25);
        registro.atualizar(40);
    }
}
