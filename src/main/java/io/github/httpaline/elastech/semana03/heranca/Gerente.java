package io.github.httpaline.elastech.semana3.heranca;

public class Gerente extends Funcionario implements Notificavel, Exportavel {
    public void exportar(){
        System.out.println("Exportado");
    }

    public void notificar(String mensagem){
        System.out.println(mensagem);
    }

    void aprovarFerias(String quem){
        System.out.println(nome+" aprovou as férias de "+quem);
    }
}
