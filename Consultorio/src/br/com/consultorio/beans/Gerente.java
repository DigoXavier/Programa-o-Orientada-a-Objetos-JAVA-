package br.com.consultorio.beans;

import java.util.Date;

public class Gerente extends Funcionario{
    private String deptResponsavel;

    public Gerente(){}

    public Gerente(String cpf, String nome, String fone, Date dtaadmissao, Date dtdemissão, double salario, String departamento, String deptResponsavel) {
        super(cpf, nome, fone, dtaadmissao, dtdemissão, salario, departamento);
        this.deptResponsavel = deptResponsavel;
    }

    public String getDeptResponsavel() {
        return deptResponsavel;
    }

    public void setDeptResponsavel(String deptResponsavel) {
        this.deptResponsavel = deptResponsavel;
    }
}
