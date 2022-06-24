package br.com.Aula4.beans;

public class Veiculo {
    private String placa;
    private int portas;
    private String modelo;
    private String categoria;
    private Motor motorizacao;


    public Veiculo(){}

    public Veiculo(String placa, int portas, String modelo, String categoria, Motor motorizacao) {
        this.placa = placa;
        this.portas = portas;
        this.modelo = modelo;
        this.categoria = categoria;
        this.motorizacao = motorizacao;
    }

    //getters e setters
    public void setMotorizacao(Motor motorizacao){
        this.motorizacao=motorizacao;
    }
    public Motor getMotorizacao(){
        return this.motorizacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //metodos
    public void acelerar(){
        System.out.println("Acelerando...");
    }
}
