package br.com.consultorio.beans;

public class Tecnologo extends Formacao{
    private boolean planoExtendido;

    public Tecnologo(){}

    public Tecnologo(String descricao, int duracao, float mensalidade, short periodo, boolean planoExtendido) {
        super(descricao, duracao, mensalidade, periodo);
        this.planoExtendido = planoExtendido;
    }

    public boolean isPlanoExtendido() {
        return planoExtendido;
    }

    public void setPlanoExtendido(boolean planoExtendido) {
        this.planoExtendido = planoExtendido;
    }

    @Override
    public void definirDuracao() {
        setDuracao(24);
    }

    @Override
    public void calcularMensalidade(double fator) {
        setMensalidade(getMensalidade()*fator*200);
    }
}
