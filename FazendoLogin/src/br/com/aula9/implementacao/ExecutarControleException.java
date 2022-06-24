package br.com.aula9.implementacao;

import br.com.aula9.excecao.ControleException;

import javax.swing.*;

public class ExecutarControleException {
    public static void main(String[] args) throws ControleException {

        try {
            int vl1 = Integer.parseInt(JOptionPane.showInputDialog("Valor1::"));
            int vl2 = Integer.parseInt(JOptionPane.showInputDialog("Valor2:"));

            JOptionPane.showMessageDialog(null, "Resultado: " + (vl1 / vl2));
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"estamos com instabilidade");
            throw new ControleException("Email", ex);

        }catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null,"estamos com instabilidade");
            throw new ControleException("LOG", ex);

        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Operação invalida");
            throw new ControleException("Erro",ex);
        } finally {
            JOptionPane.showMessageDialog(null,"Processo finalizado");
        }

        System.out.println("Fim");
    }
}
