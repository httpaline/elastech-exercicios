package io.github.httpaline.elastech.semana04.revisao.sistemaFuncionario;

public class NotficadorSms implements Notificador{

    @Override
    public void notificar(String mensagem) {
        System.out.println("Sms: "+mensagem);
    }
}
