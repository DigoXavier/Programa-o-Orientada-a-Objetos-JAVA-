package implementacao;

import beans.Produto;

import javax.swing.*;

public class ExecutarProduto2 {
    public static void main(String[] args) {
        Produto p1=new Produto(JOptionPane.showInputDialog("Digite o produto"), JOptionPane.showInputDialog("Digite a marca"), Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")), Boolean.parseBoolean(JOptionPane.showInputDialog("Em promoção:")));

        String texto;
        texto=JOptionPane.showInputDialog("Digite o produto:");
        p1.setNome(texto);
        texto=JOptionPane.showInputDialog("Digite a marca:");
        p1.setMarca(texto);
        double val;
        val=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
        p1.setValor(val);

        int resp=JOptionPane.showConfirmDialog(null,"O produto esta em promoção?","pergunta",JOptionPane.YES_NO_OPTION);
        if(resp==0){
            p1.setPromocao(true);
        } else{
            p1.setPromocao(false);
        }

        System.out.println(p1.detalhes());

        Produto p2=new Produto(JOptionPane.showInputDialog("Digite o produto"),
                               JOptionPane.showInputDialog("Digite a marca"),
                               Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")),
                               Boolean.parseBoolean(JOptionPane.showInputDialog("Em promoção:")));


    }
}
