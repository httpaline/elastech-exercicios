package io.github.httpaline.elastech.semana05.decorator;

public class Main {
    static void main() {
        Acai acaiComGranola = new ComGranola(new AcaiSimples());
        System.out.println(acaiComGranola.getDescricao());
        System.out.printf("R$ %.2f%n", acaiComGranola.getPreco());

        Acai acaiComGranolaEMorango = new ComMorango(new ComGranola(new AcaiSimples()));
        System.out.println(acaiComGranolaEMorango.getDescricao());
        System.out.printf("R$ %.2f%n", acaiComGranolaEMorango.getPreco());
    }
}
