package br.com.consultorio.implementacao;

import br.com.consultorio.beans.Agendamento;
import br.com.consultorio.beans.Funcionario;
import br.com.consultorio.beans.Medico;
import br.com.consultorio.beans.Paciente;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExecutarAgendamento {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatDate= new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat formatDateTime= new SimpleDateFormat("yyyy/MM/dd hh:mm");


        Paciente paciente= new Paciente("123456789","Fausto Silva","98979687");

        Funcionario func=new Funcionario("98765","Digo","911",formatDate.parse("2021/01/01"),null,1500, "ADM");

        Medico med=new Medico("123","dr.plinio","4344",formatDate.parse("2020/01/01"),null,15000,"Médico","Clinico geral",222);

        Agendamento agenda=new Agendamento(paciente,formatDateTime.parse("2022/04/20 22:00"),med,func,450);

        System.out.println(agenda.consultaAgenda());
    }
}
