package io.github.httpaline.elastech.semana04.encapsulamento;

public class ContaBancaria {
    private String titular;
    private String numeroConta = "001-X";
    private double saldo;



    void setTitular(String titular){
        if(titular==null || titular.isEmpty()){
            System.out.println("Inválido! Mantido " + this.titular);
            return;
        }
        this.titular=titular;
    }

    String getNumeroConta(){
        return numeroConta;
    }


    double getSaldo(){
        return saldo;
    }


    private boolean temSaldo(double valor){
        return saldo>=valor;
    }

    private void registrarLog(String acao){
        System.out.println("[LOG] "+titular+": "+acao);
    }

    public void sacar(double valor){
        if(!temSaldo(valor)){
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo-=valor;
        registrarLog("saque de "+valor);
    }

    public void depositar(double valor){
        if(valor>0){
            saldo+=valor;
            registrarLog("depósito de "+valor);
        }else{
            System.out.println("Valor inválido!");
        }

    }



}
