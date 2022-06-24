package br.com.consultorio.beans;

import br.com.consultorio.interfaces.FormacaoMetodos;

public class Medio extends Formacao {
    private String tipo;

    public Medio(){}

    public Medio(String descricao, int duracao, float mensalidade, short periodo, String tipo) {
        super(descricao, duracao, mensalidade, periodo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void definirDuracao() {
        setDuracao(36);
    }

    @Override
    public void calcularMensalidade(double fator) {
        setMensalidade(getMensalidade() * fator * 100);
    }
}
