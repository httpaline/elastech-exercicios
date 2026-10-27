package io.github.httpaline.elastech.semana05.decorator;

public class ComGranola extends AcaiDecorator{
    public ComGranola(Acai acai){
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + granola";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 2.00;
    }
}
