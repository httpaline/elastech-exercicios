package io.github.httpaline.elastech.semana3.heranca;

public class Professora extends Pessoa {
    String disciplina;

    void lancarNota(String aluna,double nota){
        System.out.println(nome+" lançou nota "+nota+" para "+aluna);
    }

    @Override
    void apresentar() {
        System.out.println("Oi, sou "+nome+" e ensino "+disciplina);
    }
}
