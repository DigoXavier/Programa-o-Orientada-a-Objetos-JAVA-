package implementacao;

import beans.Conta;
import util.Formulario;

import java.util.Scanner;

public class ExecutarConta3 {
    public static void main(String[] args) {
        Conta conta1 = new Conta(Formulario.sal("Qual o saldo?"), Formulario.num("Qual o numero da conta?"), Formulario.cli("Qual o nome do cliente?"), Formulario.lim("Qual o limite disponivel?"), Formulario.tpcont("Qual o tipo de conta bancaria?"));
        Formulario.show(conta1.detalhes());
    }
}
