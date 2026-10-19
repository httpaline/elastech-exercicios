package io.github.httpaline.elastech.semana04.revisao.sistemaFuncionario;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.2;
    }
}
