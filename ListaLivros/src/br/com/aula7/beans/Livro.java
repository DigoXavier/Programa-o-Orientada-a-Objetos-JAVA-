package br.com.aula7.beans;

public class Livro implements Comparable<Livro> {

    //Atributos
    private String titulo;
    private String isbn;
    private String autor;
    private int paginas;
    private double preco;

    //Construtores
    public Livro(){}

    public Livro(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public Livro(String titulo, String autor, String isbn, int paginas, double preco) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.paginas = paginas;
        this.preco = preco;
    }

    //Getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Métodos
    @Override
    public String toString() {
        return "\ntitulo='" + titulo + '\'' +
                ", preco=" + preco + "\n";
    }

    @Override
    public int compareTo(Livro outroLivro) {
        return this.titulo.compareToIgnoreCase(outroLivro.getTitulo());
    }
}
