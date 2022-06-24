package br.com.aula4.beans;

public class Banco {
    //Atributos
    private String razaoSocial;
    private int idBancario;

    //Construtores
    public Banco(){}

    public Banco(String razaoSocial, int idBancario){
        this.razaoSocial=razaoSocial;
        this.idBancario=idBancario;
    }

    //Getters e setters
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getIdBancario() {
        return idBancario;
    }

    public void setIdBancario(int idBancario) {
        this.idBancario = idBancario;
    }

    //Método
    public String mostrarBanco(){
        return "Nome do banco=" + razaoSocial + "                Id bancario=" + idBancario;
    }
}
