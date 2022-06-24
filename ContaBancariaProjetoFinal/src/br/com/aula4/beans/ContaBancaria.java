package br.com.aula4.beans;

import br.com.aula4.excecao.MeuException;

import javax.swing.*;

public abstract class ContaBancaria {
    //Atributos
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente cliente;
    private Banco banco;

    //Construtores
    public ContaBancaria(){}

    public ContaBancaria(int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public ContaBancaria(int numero, int agencia, double saldo, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
        this.banco=banco;
    }

    //Getters e setters
    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public Cliente getCliente() {
        return cliente;
    }

    //Métodos
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String saque(double valor) throws MeuException {
        try {
            if ((saldo) >= valor) {
                this.saldo = saldo - valor;
                return ("Sucesso, pegue seu dinheiro");
            }
            return "Saldo insuficiente";
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro inesperado");
            throw new MeuException("saque",ex);
        }
    }

    public String deposito(double valor) throws Exception {
        if(valor>1000){
            throw new Exception("Valor não permitido para esta operação");
        }
        return "Sucesso!";
    }

    public String extrato() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                "\nCliente=" + cliente.mostrarcliente() +
                "\nBanco="+ banco.mostrarBanco();
    }
}
