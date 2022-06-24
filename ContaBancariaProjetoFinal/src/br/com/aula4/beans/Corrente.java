package br.com.aula4.beans;

public class Corrente extends ContaBancaria {
    //Atributos
    private double limite;
    private double taxa;

    //Construtores
    public Corrente(){}

    public Corrente(int numero, int agencia, double saldo, Cliente cliente, Banco banco, double limite, double taxa) {
        super(numero, agencia, saldo, cliente, banco);
        this.limite = limite;
        this.taxa = taxa;
    }


    //Getters e setters
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String definirLimite(double valor){
        this.limite= valor;
        return "Seu limite é de" + limite;
    }

    //Métodos(Importados da classe mãe {ContaBancaria})
    @Override
    public String extrato() {
        return super.extrato() + "contaCorrente{ limite="+this.limite+ ", taxa="+this.taxa ;
    }

    @Override
    public String saque(double valor) {
        if((getSaldo()+limite) >= valor){
            setSaldo(getSaldo()-valor);
            return "Saque realizado";
        }
        return "Saldo insuficiente";
    }
}
