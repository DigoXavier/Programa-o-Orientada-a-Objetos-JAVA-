package br.com.consultorio.beans;

import java.util.Date;

public class Agendamento {
    private Paciente paciente;
    private Date dataHora;
    private Medico medico;
    private Funcionario atendente;
    private double valor;

    public Agendamento(){}

    public Agendamento(Paciente paciente, Date dataHora, Medico medico, Funcionario atendente, double valor) {
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.medico = medico;
        this.atendente = atendente;
        this.valor = valor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Funcionario getAtendente() {
        return atendente;
    }

    public void setAtendente(Funcionario atendente) {
        this.atendente = atendente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String agendar(){
        return "Agendado com sucesso " + this.dataHora;
    }
    
    public String consultaAgenda() {
        return "Agendamento{" +
                "paciente=" + paciente.getNome() +
                ", dataHora=" + dataHora +
                ", medico=" + medico.getNome() +
                ", atendente=" + atendente.getNome() +
                ", valor=" + valor +
                '}';
    }
}
