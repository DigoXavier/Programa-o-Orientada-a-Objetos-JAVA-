package br.com.aula5.beans;

import br.com.aula5.interfaces.PadraoImposto;

public class Produto implements PadraoImposto {
    //Atributos
    private int codigo;
    private double preco;
    private String descricao;

    //Construtores
    public Produto(){}

    public Produto(int codigo, double preco, String descricao) {
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
    }

    //Getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Métodos
    public String detalhes() {
        return "Produto{" +
                "codigo=" + codigo +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    @Override
    public void calcularImposto(double percentual) {
        System.out.println("Valor de imposto"+this.preco+percentual);
    }
}
