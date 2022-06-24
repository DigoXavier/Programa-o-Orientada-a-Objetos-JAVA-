package implementacao;

import beans.Conta;

import javax.swing.*;

public class ExecutarConta2 {
    public static void main(String[] args) {
        Conta conta1=new Conta();
        int num;
        num=(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta")));
        conta1.setNumero(num);
        double saldo;
        saldo=Double.parseDouble(JOptionPane.showInputDialog("Digite aqui o saldo da conta"));
        conta1.setSaldo(saldo);
        String nome;
        nome=JOptionPane.showInputDialog("Qual o nome do cliente?");
        conta1.setCliente(nome);
        double limite;
        limite=Double.parseDouble(JOptionPane.showInputDialog("Qual o limite?"));
        conta1.setLimiteEspecial(limite);
        String tpConta;
        tpConta=JOptionPane.showInputDialog("Qual o tipo da conta?");
        conta1.setTipoConta(tpConta);

    }
}
