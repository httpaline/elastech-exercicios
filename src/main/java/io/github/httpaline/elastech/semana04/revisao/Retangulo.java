package io.github.httpaline.elastech.semana04.revisao;

public class Retangulo extends Forma {
    double largura;
    double altura;

    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
