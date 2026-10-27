package io.github.httpaline.elastech.semana05.decorator;

public class ComMorango extends AcaiDecorator{
    public ComMorango(Acai acai){
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + morango";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 4.00;
    }
}
