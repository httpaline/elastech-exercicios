package io.github.httpaline.elastech.semana04.revisao.sistemaFuncionario;

public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("Email: "+mensagem);
    }
}
