package io.github.httpaline.elastech.semana04.revisao.sistemaFuncionario;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("O salário base não pode ser negativo.");
        }
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}
