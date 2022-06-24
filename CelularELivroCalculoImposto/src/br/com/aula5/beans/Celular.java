package br.com.aula5.beans;

public class Celular extends Produto {
    //Atributos
    private int cameraMega;
    private int armazenamento;

    //Construtor
    public Celular(int codigo, double preco, String descricao, int cameraMega, int armazenamento) {
        super(codigo, preco, descricao);
        this.cameraMega = cameraMega;
        this.armazenamento = armazenamento;
    }

    //Getters e setters
    public int getCameraMega() {
        return cameraMega;
    }

    public void setCameraMega(int cameraMega) {
        this.cameraMega = cameraMega;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    //essa classe não tem o metodo detalhe, então será utilizado o metodo existente na classe pai(super classe)
}
