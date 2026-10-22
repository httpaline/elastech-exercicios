package io.github.httpaline.elastech.semana03.polimorfismo;

public class Main {

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

    static void main() {
        System.out.println("----- 1 -----");
        Calculadora calc = new Calculadora();
        System.out.println("Quadrado: " + calc.calcularArea(4.0));
        System.out.println("Retângulo: " + calc.calcularArea(4.0, 5.0));
        System.out.println("Círculo: " + calc.calcularArea(3));

        System.out.println("\n----- 2 -----");
        Painel painel = new Painel();
        painel.exibir("Olá");
        painel.exibir(42);
        painel.exibir(true);
        painel.exibir(9.5);

        System.out.println("\n----- 3 -----");
        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 22;
        ana.curso = "Java Full Stack";

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        ana.apresentar();
        ana.estudar();
        flora.apresentar();
        flora.lancarNota(ana.nome, 9.5);

        System.out.println("\n----- 4 -----");
        Estagiaria bia = new Estagiaria();
        bia.nome = "Bia";
        bia.idade = 19;

        Pessoa pessoa = bia;
        pessoa.apresentar();

        System.out.println("\n----- 5 -----");
        mostrarFicha(ana);
        mostrarFicha(flora);
        mostrarFicha(bia);

        System.out.println("\n----- 6 -----");
        MeioDePagamento forma;
        forma = new Pix();
        forma.pagar(150.00);
        forma = new Boleto();
        forma.pagar(150.00);
    }
}