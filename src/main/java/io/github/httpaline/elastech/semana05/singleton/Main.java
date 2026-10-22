package io.github.httpaline.elastech.semana05.singleton;

public class Main {
    static void main() {
//        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
//        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();
//
//        pagina1.registrarVisita();
//        pagina2.registrarVisita();
//
//        System.out.println(pagina1.getTotal());
//        System.out.println(pagina2.getTotal());

        Carrinho telaProduto=Carrinho.getInstancia();
        Carrinho telaPromocoes=Carrinho.getInstancia();

        telaProduto.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println(telaProduto.getQuantidadeItens());
        System.out.println(telaPromocoes.getQuantidadeItens());
    }
}
