package io.github.httpaline.elastech.semana06.lambda;

public class Main {

    static void repetir(Acao acao) {
        acao.executar();
        acao.executar();
    }

    static void mostrarResultado(Operacao op,int valor){
        System.out.println(op.aplicar(valor));
    }

    static void executarSe(Condicao cond, int valor, Acao acao){
        if(cond.testar(valor)){
            acao.executar();
        }
    }

    static void main() {
        Saudacao saudacao = () -> System.out.println("oi");
        saudacao.executar();

        impressora impressora = (texto) -> System.out.println(texto);
        impressora.imprimir("impressora");

        Calculo soma = (a,b) -> a + b;
        Calculo multiplicacao = (a,b) -> a * b;
        Calculo maior = (a,b) -> a > b ? a : b;

        System.out.println("Soma: " + soma.calcular(5, 3));
        System.out.println("Multiplicação: " + multiplicacao.calcular(5, 3));
        System.out.println("Maior: " + maior.calcular(5, 3));

        repetir(() -> System.out.println("oi"));

        mostrarResultado(n -> n * 2,5);
        mostrarResultado(n -> n * n,5);
        mostrarResultado(n -> -n,5);

        executarSe(n -> n % 2 ==0,4,() -> System.out.println("é par!"));
        executarSe(n -> n % 2 ==0,7,() -> System.out.println("é par!"));

    }
}