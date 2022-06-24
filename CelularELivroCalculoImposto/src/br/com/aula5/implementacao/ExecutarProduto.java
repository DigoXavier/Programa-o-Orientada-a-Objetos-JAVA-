package br.com.aula5.implementacao;

import br.com.aula5.beans.Celular;
import br.com.aula5.beans.Livro;
import br.com.aula5.beans.Produto;

public class ExecutarProduto {
    public static void main(String[] args) {
        /*
        Produto p1=new Produto();
        p1.setCodigo(10);
        p1.setDescricao("Aprendendo Java");
        p1.setPreco(25);
         */

        Produto p2=new Produto(20,100,"Mouse com fio");
        Livro l2=new Livro(21,50,"Aprendendo JAVA","12345","FIAP school");
        Celular c2=new Celular(22,1500,"Galaxy S10",25,256);
        System.out.println(l2.detalhes());
        System.out.println(p2.detalhes());

        // usando metodo da classe pai
        System.out.println(c2.detalhes());
        p2.calcularImposto(1.10);
    }
}
