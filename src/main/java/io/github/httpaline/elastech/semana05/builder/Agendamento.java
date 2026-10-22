package io.github.httpaline.elastech.semana05.builder;

public class Agendamento {
    private final String nomePet;
    private final String servico;
    private final String horario;
    private final boolean perfume;
    private final boolean laco;
    private final boolean hidratacao;
    private final String observacao;
    private final double desconto;

    public Agendamento(Builder builder) {
        this.nomePet = builder.nomePet;
        this.servico = builder.servico;
        this.horario = builder.horario;
        this.perfume = builder.perfume;
        this.laco = builder.laco;
        this.hidratacao = builder.hidratacao;
        this.observacao = builder.observacao;
        this.desconto = builder.desconto;
    }

    public static class Builder {
        private final String nomePet;
        private final String servico;
        private final String horario;
        private boolean perfume = false;
        private boolean laco = false;
        private boolean hidratacao = false;
        private String observacao = "";
        private double desconto;

        public Builder(String nomePet, String servico, String horario) {
            this.nomePet = nomePet;
            this.servico = servico;
            this.horario = horario;
        }

        public Builder comPerfume(){
            this.perfume = true;
            return this;
        }

        public Builder comLaco(){
            this.laco = true;
            return this;
        }

        public Builder comHidratacao() {
            this.hidratacao = true;
            return this;
        }

        public Builder observacao(String observacao) {
            this.observacao = observacao;
            return this;
        }

        public Builder desconto(double desconto) {
            this.desconto = desconto;
            return this;
        }

        public Agendamento build(){
            return new Agendamento(this);
        }
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
