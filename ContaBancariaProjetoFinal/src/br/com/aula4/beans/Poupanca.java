package br.com.aula4.beans;

public class Poupanca extends ContaBancaria{
    //Atributos
    private double rendimento;


    //Construtores
    public Poupanca(){}

    public Poupanca(int numero, int agencia, double saldo, Cliente cliente, Banco banco, double rendimento) {
        super(numero, agencia, saldo, cliente, banco);
        this.rendimento = rendimento;
    }

    //Getters e setters

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    //Métodos
    public String creditarRendimento(){
        double valor= ((rendimento/100)*getSaldo()) + getSaldo();
        setSaldo(valor);
        return "Sucesso";
    }
}
