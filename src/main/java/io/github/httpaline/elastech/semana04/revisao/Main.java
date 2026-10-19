package io.github.httpaline.elastech.semana04.revisao;

public class Main {
    static void main() {
        Produto produto = new Produto();

        produto.setNome("Poke");
        produto.setPreco(35);
        produto.setQuantidade(15);

        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidade());

        //----------------------------

        Retangulo r = new Retangulo("retangulo",40.0,50.0);
        r.exibirNome();
        System.out.println(r.calcularArea());
        //Forma f = new Forma("TESTE"); Classe abstrata não pode ser instanciada.
    }
}
