package br.com.aula4.excecao;

public class MeuException extends Exception{

    public MeuException(String mensagem, Exception ex){
        super(mensagem, ex);

        if(mensagem.equalsIgnoreCase("saque")){
            perSaq();
        }
    }

    public void perSaq(){
        
    }

}
