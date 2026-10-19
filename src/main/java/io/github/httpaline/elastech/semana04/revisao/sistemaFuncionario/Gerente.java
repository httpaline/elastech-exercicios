package io.github.httpaline.elastech.semana04.revisao.sistemaFuncionario;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.5;
    }
}
