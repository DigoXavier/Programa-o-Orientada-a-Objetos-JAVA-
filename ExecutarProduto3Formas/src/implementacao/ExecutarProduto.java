package implementacao;

import beans.Produto;

import javax.swing.*;

public class ExecutarProduto {
    public static void main(String[] args) {
        Produto p1=new Produto(JOptionPane.showInputDialog("Digite o produto"), JOptionPane.showInputDialog("Digite a marca"), Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")), Boolean.parseBoolean(JOptionPane.showInputDialog("Em promoção:")));
        p1.setNome("Note dell");
        p1.setValor(100);

        System.out.println("O produto " + p1.getNome() + " está no valor de " +p1.getValor());

        Produto p2=new Produto("Intel",150);
        System.out.println("O produto " + p2.getNome() + " está no valor de " +p2.getValor());

        Produto p3=new Produto("S10",1000,"Sansung",false);
        System.out.println("O produto " + p3.getNome() + " está no valor de " +p3.getValor()+ " da marca "+p3.getMarca());

        JOptionPane.showMessageDialog(null,p3.detalhes());
    }
}
