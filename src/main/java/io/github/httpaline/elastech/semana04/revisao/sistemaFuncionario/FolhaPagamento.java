package io.github.httpaline.elastech.semana04.revisao.sistemaFuncionario;

public class FolhaPagamento {
    private final Notificador notificador;

    public FolhaPagamento(Notificador notificador) {
        this.notificador = notificador;
    }

    public void pagar(Funcionario f) {
        double salario = f.calcularSalario();
        notificador.notificar(String.format("Olá %s! Seu salário de R$ %.2f foi depositado.",f.getNome(),salario));
    }
}
