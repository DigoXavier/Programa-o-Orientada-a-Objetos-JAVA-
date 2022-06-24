package br.com.consultorio.beans;

import br.com.consultorio.interfaces.FormacaoMetodos;

public abstract class Formacao implements FormacaoMetodos {
    //Atributos
    private String descricao;
    private int duracao;
    private double mensalidade;
    private short periodo;

    //Construtores
    public Formacao(){}

    public Formacao(String descricao, int duracao, float mensalidade, short periodo) {
        this.descricao = descricao;
        this.duracao = duracao;
        this.mensalidade = mensalidade;
        this.periodo = periodo;
    }

    //Getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public short getPeriodo() {
        return periodo;
    }

    public void setPeriodo(short periodo) {
        this.periodo = periodo;
    }

    //Métodos
    public float retornarMedia(float ps1, float ps2){
        return ((ps1+ps2)/2);
    }

    public float retornarMedia(float ps1, float ps2, float nac1, float nac2){
        return((ps2+ps1)/2) + ((nac1*nac2)/2) * 1.05f;
    }

    public float retornarMedia(float ps1, float ps2,float nac1,float nac2, float am1, float am2){
        return((ps1+ps2+nac1+nac2+am1+am2)/6);
    }
    /*
    public void calcularMensalidade(double fator) {
        System.out.println("Método calcular mensalidade não declarado");
    }

    public void definirDuracao(){
        System.out.println("Método definir duração não declarado");
    }
     */
}
