package io.github.httpaline.elastech.semana05.adapter;

public class PaypalAdapter implements Pagamento {
    PaypalAPI paypalAPI;

    public PaypalAdapter(PaypalAPI paypalAPI){
        this.paypalAPI=paypalAPI;
    }

    @Override
    public void pagar() {
        paypalAPI.sendPayment();
    }
}
