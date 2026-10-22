package io.github.httpaline.elastech.semana05.adapter;

public class Main {
    static void main() {

//        Pagamento pagamento = new PaypalAPI();
//        pagamento.pagar();

        Pagamento p = new PaypalAdapter(new PaypalAPI());
        p.pagar();
    }
}
