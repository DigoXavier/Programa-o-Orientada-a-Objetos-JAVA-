package br.com.aula9.excecao;

public class ControleException extends Exception {

    //LogBancoDados + EnvioEmail


    public ControleException(String message, Exception ex) {
        super(message, ex);
        print();

        if(message.equalsIgnoreCase("email")){
            enviarEmail();
        }

        if(message.equalsIgnoreCase("log")){
            logbanco();
        }
    }
    private void logbanco(){
        System.out.println("Abrindo conexão BD");
        System.out.println("-----Gravando Detalhes-----");
        System.out.println(getMessage());
        printStackTrace();
    }

    private void enviarEmail(){
        String smtpServer = "smtp://fiap.br";
        String smtpPort = "22";

        System.out.println("Abrindo conexão email");
        System.out.println("-email suporte: Suporte@Fiap.br");
        System.out.println("-----Detalhes-----");
        System.out.println(getMessage());
        printStackTrace();
    }

    private void print(){
        System.out.println("=== Meu Exception ===");
        System.out.println(getMessage());
    }
}
