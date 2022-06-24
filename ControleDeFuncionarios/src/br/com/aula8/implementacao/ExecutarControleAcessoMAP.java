package br.com.aula8.implementacao;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ExecutarControleAcessoMAP {
    public static void main(String[] args) {
        Map<String, Date> controleAcesso= new HashMap<String, Date>();
        DateFormat formatDate= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Iniciando controle de acesso");

        while(true){
            String tipo = JOptionPane.showInputDialog("Digite <E>ntrada ou <S>aida");
            if(tipo.equalsIgnoreCase("E")){
                String cracha = JOptionPane.showInputDialog("Leitor crachá: ");
                if(!controleAcesso.containsKey(cracha)){
                    JOptionPane.showMessageDialog(null,"Seja bem vindo \n\t Acesso liberado " + cracha);
                    Date dataSistema=new Date();
                    controleAcesso.put(cracha, dataSistema);
                }else{
                    JOptionPane.showMessageDialog(null,"Entrada ja registrada para esse crachá " + cracha + "- " +controleAcesso.get(cracha));
                }

                if(tipo.equalsIgnoreCase("s")){
                    String cracha = JOptionPane.showInputDialog("Leitor CRACHA: ");
                    if (controleAcesso.containsKey(cracha)){
                        JOptionPane.showMessageDialog(null,"Obrigado pela visita " + cracha + " - " + formatDate.controleAcesso.get(cracha)+ "\n");
                    }
                }
                System.out.println(controleAcesso);
            }
        }
    }
}
