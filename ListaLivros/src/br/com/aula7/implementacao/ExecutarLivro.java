package br.com.aula7.implementacao;

import br.com.aula7.beans.Livro;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecutarLivro {
    public static void main(String[] args) {


        List<Livro> livros = new ArrayList<Livro>();
        while(true){
            System.out.println("-- Carregar dados do livro");

            livros.add(new Livro(JOptionPane.showInputDialog("Titulo:"), Double.parseDouble(JOptionPane.showInputDialog("Preço: "))));

            Collections.sort(livros);

            System.out.println("\nLista de livros:");
            System.out.println(livros.toString());

        }


    }
}
