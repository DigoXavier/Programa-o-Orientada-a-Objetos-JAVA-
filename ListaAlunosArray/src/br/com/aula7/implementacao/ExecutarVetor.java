package br.com.aula7.implementacao;

import br.com.aula7.beans.Aluno;

import javax.swing.*;

public class ExecutarVetor {
    public static void main(String[] args) {
        String listaNome[] = {"Ana", "Beatriz", "Maria"};

        //Apresentação
        System.out.println("ListaNome: " + listaNome);
        System.out.println("Visualizar ListaNome[1]: " + listaNome[1]);

        listaNome[1] = "Jose";
        System.out.println("Visualizar ListaNome[1]" + listaNome[1]);

        //limite de tamanho conforme inicialização
        //listaNome[3] = "Antonio";



        for(int posicao=0; posicao< listaNome.length; posicao++){
            System.out.println("Indice[" + posicao + "] " + listaNome[posicao]);
        }
        // pesquisar
        String procurar= JOptionPane.showInputDialog("Nome para pesquisar:");
        for(int posicao=0; posicao< listaNome.length; posicao++){
            if(listaNome[posicao].equalsIgnoreCase(procurar)){
                JOptionPane.showMessageDialog(null,"Achei : ) - " + listaNome[posicao], "Aviso", 2);
            }
        }

        // Usando objeto

        Aluno[] listaAluno = new Aluno[3];

        listaAluno[0] = new Aluno("Ana" , 8, 0, 20);
        listaAluno[0] = new Aluno("Digo" , 6, 5, 15);
        listaAluno[0] = new Aluno("Mari" , 9, 10, 18);

        System.out.println("Visualizar ListaAluno[1]" + listaAluno[1].getNome());

        listaAluno[1].setFaltas(1);

        for(int posicao=0; posicao< listaAluno.length; posicao++){
            if(listaAluno[posicao].getNome().equalsIgnoreCase(procurar)){
                JOptionPane.showMessageDialog(null,"Achei : ) - " + listaAluno[posicao].getNome(), "Aviso", 2);
            }
        }
    }
}
