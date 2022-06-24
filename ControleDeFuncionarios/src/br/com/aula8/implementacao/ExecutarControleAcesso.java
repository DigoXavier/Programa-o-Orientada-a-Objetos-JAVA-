package br.com.aula8.implementacao;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class ExecutarControleAcesso {
    public static void main(String[] args) {
        Set<String> controleAcesso = new HashSet<String>();

        System.out.println("Iniciando Controle de Acesso");

        while(true) {
            String tipo = JOptionPane.showInputDialog("Digite <E>ntrada ou <S>aída");

            if(tipo.equalsIgnoreCase("E")) {
                String crachá = JOptionPane.showInputDialog("Leitor de crachá: ");
                if (!controleAcesso.contains(crachá)) {
                    controleAcesso.add(crachá);
                    JOptionPane.showMessageDialog(null, "Bem vindo \n\t Acesso LIBERADO " + crachá);
                } else {
                    controleAcesso.remove(crachá);
                    JOptionPane.showMessageDialog(null, "Obrigado pela visita: " + crachá);
                }
            }
            if(tipo.equalsIgnoreCase("S")) {
                String crachá = JOptionPane.showInputDialog("Leitor de crachá: ");
                if (!controleAcesso.contains(crachá)) {
                    controleAcesso.remove(crachá);
                    JOptionPane.showMessageDialog(null, "Obrigado pela visita: " + crachá);
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada não registrada pelo sistema");
                }
            }
            System.out.println(controleAcesso);
        }
    }
}
