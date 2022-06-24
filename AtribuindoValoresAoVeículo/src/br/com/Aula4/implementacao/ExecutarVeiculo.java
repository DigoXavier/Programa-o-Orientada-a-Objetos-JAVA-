package br.com.Aula4.implementacao;

import br.com.Aula4.beans.Motor;
import br.com.Aula4.beans.Veiculo;

public class ExecutarVeiculo {
    public static void main(String[] args) {
        Veiculo fusca=new Veiculo();
        Veiculo kombi=new Veiculo();
        Motor vw=new Motor(80,4,"gasolina");
        Motor vw2=new Motor(90,4,"gasolina");
        vw.ligar();
        vw.desligar();

        fusca.acelerar();
        fusca.setModelo("Fusca Itamar");
        fusca.setCategoria("Hatch");
        fusca.setPlaca("ABC-1234");
        fusca.setPortas(2);
        //precisa ter um objeto motor
        fusca.setMotorizacao(vw);

        System.out.println("Usando o fusca");
        System.out.println(fusca.getModelo() + "-" + fusca.getMotorizacao().toString());

        kombi.setModelo("Kombi Surf");
        kombi.setMotorizacao(vw2);
        System.out.println(kombi.getModelo()+"-"+kombi.getMotorizacao().toString());
    }
}
