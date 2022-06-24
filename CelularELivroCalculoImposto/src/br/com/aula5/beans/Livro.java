package br.com.aula5.beans;

public class Livro extends Produto{
    //Atributos
    private String isbn;
    private String autor;

    //Construtor
    public Livro(int codigo, double preco, String descricao, String isbn, String autor) {
        super(codigo, preco, descricao);
        this.isbn = isbn;
        this.autor = autor;
    }

    //Getters e setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Método
    @Override
    public String detalhes() {
        return super.detalhes()+ "Livro{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
