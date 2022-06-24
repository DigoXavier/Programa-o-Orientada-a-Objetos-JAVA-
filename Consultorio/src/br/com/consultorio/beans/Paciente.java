package br.com.consultorio.beans;

public class Paciente extends Pessoa {
    public Paciente(){}

    public Paciente(String cpf, String nome, String fone) {
        super(cpf, nome, fone);
    }
}
