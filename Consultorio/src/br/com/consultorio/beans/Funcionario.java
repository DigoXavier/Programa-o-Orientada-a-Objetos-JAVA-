package br.com.consultorio.beans;

import java.util.Date;

public class Funcionario extends Pessoa{
    private Date dtaadmissao;
    private Date dtdemissão;
    private double salario;
    private String departamento;

    public Funcionario(){}

    public Funcionario(String cpf, String nome, String fone, Date dtaadmissao, Date dtdemissão, double salario, String departamento) {
        super(cpf, nome, fone);
        this.dtaadmissao = dtaadmissao;
        this.dtdemissão = dtdemissão;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Date getDtaadmissao() {
        return dtaadmissao;
    }

    public void setDtaadmissao(Date dtaadmissao) {
        this.dtaadmissao = dtaadmissao;
    }

    public Date getDtdemissão() {
        return dtdemissão;
    }

    public void setDtdemissão(Date dtdemissão) {
        this.dtdemissão = dtdemissão;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
