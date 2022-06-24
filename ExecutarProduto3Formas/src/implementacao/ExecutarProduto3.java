package implementacao;

import beans.Produto;
import util.Input;

public class ExecutarProduto3 {
    public static void main(String[] args) {
       Produto p1=new Produto(Input.texto("Informe o produto"),Input.decimal("1200"),Input.texto("marca"),Input.logico("Está em promoção?"));
        //Input obj= new Input();
        Input.show(p1.detalhes());
        //obj.texto("Meu texto");
    }
}
