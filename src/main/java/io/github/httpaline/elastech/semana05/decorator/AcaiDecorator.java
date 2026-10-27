package io.github.httpaline.elastech.semana05.decorator;

public class AcaiDecorator implements Acai{
    protected Acai acaiEmbrulhado;

    public AcaiDecorator(Acai acai) {
        this.acaiEmbrulhado = acai;
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao();
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco();
    }
}
