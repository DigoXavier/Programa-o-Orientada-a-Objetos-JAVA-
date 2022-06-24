package implementacao;

import beans.Conta;

import java.util.Scanner;

public class executarConta {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        Conta conta1=new Conta();
        int opcao;
        String con;
        double valor;
        Scanner cont=new Scanner(System.in);

        System.out.println("Digite aqui o nome do cliente");
        conta1.setCliente(leitor.nextLine());
        System.out.println("Defina aqui seu limite");
        conta1.definirLimite(leitor.nextDouble());
        System.out.println("Digite aqui o número da conta:");
        conta1.setNumero(leitor.nextInt());
        System.out.println("Digite aqui qual o valor que temos na conta:");
        conta1.setSaldo(leitor.nextInt());

        do{
            System.out.println("Digite 1 para sacar dinheiro, 2 para depositar, ou outro valor para apenas continuar");
            opcao=leitor.nextInt();
            switch(opcao){
                case 1: System.out.println("Digite aqui qual será o valor do saque");
                    conta1.sacar(leitor.nextDouble());break;
                case 2: System.out.println("Digite aqui qual será o valor do depósito:");
                    conta1.depositar(leitor.nextDouble());break;
                default:System.out.println("Saldo continua o mesmo, sem saques nem depósitos");
            }
            System.out.println("Aperte S para voltar o processo, ou outra tecla para cancelar");
            con=cont.nextLine();
        }while(con.equalsIgnoreCase("s"));
    }
}
