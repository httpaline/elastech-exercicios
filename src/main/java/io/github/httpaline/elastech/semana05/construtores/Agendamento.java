package io.github.httpaline.elastech.semana05.construtores;

public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    double desconto;

    public Agendamento(String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto) {
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    public void mostrar(){
        System.out.println("Pet: "+nomePet);
        System.out.println("Serviço: "+servico);
        System.out.println("Horario: "+horario);
        System.out.println("Perfume: "+(perfume?"Sim":"Não"));
        System.out.println("Laço: "+(laco?"Sim":"Não"));
        System.out.println("Hidratação: "+(hidratacao?"Sim":"Não"));
        System.out.println("Observação: "+(observacao.isEmpty()?"Nenhuma":observacao));
        System.out.println("Desconto: "+(desconto*100)+"%");
    }

}
