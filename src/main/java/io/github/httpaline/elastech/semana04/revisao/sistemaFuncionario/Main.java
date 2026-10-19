package io.github.httpaline.elastech.semana04.revisao.sistemaFuncionario;

public class Main {
    static void main() {
        Desenvolvedor dev = new Desenvolvedor("Aline",5000.00);
        Gerente gerente = new Gerente("Flora",10000.00);

        FolhaPagamento folhaEmail = new FolhaPagamento(new NotificadorEmail());
        folhaEmail.pagar(dev);
        folhaEmail.pagar(gerente);

        FolhaPagamento folhaSms = new FolhaPagamento(new NotficadorSms());
        folhaSms.pagar(dev);
        folhaSms.pagar(gerente);




    }
}
