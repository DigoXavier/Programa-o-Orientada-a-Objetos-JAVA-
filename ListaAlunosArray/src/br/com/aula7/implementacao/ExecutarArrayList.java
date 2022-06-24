package br.com.aula7.implementacao;

import br.com.aula7.beans.Aluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecutarArrayList {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<String>();

        listaNomes.add("Digo");
        listaNomes.add("Digooo");
        listaNomes.add("Mari");
        listaNomes.add("Dudu");
        listaNomes.add(0,"Cris");

        System.out.println("Tamanho listaNomes: " + listaNomes.size());
        System.out.println("Mostrar conteudo: " + listaNomes.get(0));
        System.out.println("Lista: " + listaNomes);

        Collections.sort(listaNomes);

        System.out.println("Lista ordenada: " + listaNomes);

        //pesquisar
        String procurar = JOptionPane.showInputDialog("Digite nome para pesquisa: ");

        int posicao = listaNomes.indexOf(procurar);
        if (posicao >= 0){
            System.out.println("Achou :), na posição: " + posicao + "-" + listaNomes.get(posicao));
        } else{
            System.out.println("Não localizado");
        }

        //usando classe

        System.out.println("---Agora é clase---");
        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        Aluno a1 = new Aluno("Maria" , 8, 0, 20);
        Aluno a2 = new Aluno("Beatriz" , 6, 10, 25);
        Aluno a3 = new Aluno("Ana" , 9, 5, 18);

        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        listaAlunos.add(a3);

        System.out.println("Tamanho listaAlunos: " + listaAlunos.size());
        System.out.println("Mostrar conteudo: " + listaAlunos.get(0).getNome());
        System.out.println("Lista: " + listaAlunos);

        for(Aluno item: listaAlunos){
            System.out.println(item.getNome() + " - " + item.getIdade());
        }

        Collections.sort(listaAlunos);

        System.out.println("Lista: " + listaAlunos);
    }
}
