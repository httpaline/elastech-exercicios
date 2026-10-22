package io.github.httpaline.elastech.semana04.interfaces;

public class SMS implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}