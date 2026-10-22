package io.github.httpaline.elastech.semana03.polimorfismo;

public class Aluna extends Pessoa {
    String curso;

    @Override
    void apresentar() {
        System.out.println("Oi, sou a aluna " + nome + ", tenho " + idade + " anos e estudo " + curso + ".");
    }

    void estudar() {
        System.out.println(nome + " está estudando " + curso + ".");
    }
}
