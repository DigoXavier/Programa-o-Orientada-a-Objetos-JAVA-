package br.com.consultorio.beans;

import java.util.Date;

public class Medico extends Funcionario{
    private String especialidade;
    private int crm;

    public Medico(){}

    public Medico(String cpf, String nome, String fone, Date dtaadmissao, Date dtdemissão, double salario, String departamento, String especialidade, int crm) {
        super(cpf, nome, fone, dtaadmissao, dtdemissão, salario, departamento);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }
}
