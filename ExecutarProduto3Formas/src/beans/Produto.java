package beans;

public class Produto {
    //Atributos
    private String nome;
    private String marca;
    private double valor;
    private boolean promocao;

    //Construtores
    public Produto(String digite_o_produto, String digite_a_marca, double digite_o_valor, boolean promocao){}
    public Produto(String nome, double valor){
        this.nome=nome;
        this.valor=valor;
    }

    public Produto(String nome,double valor, String marca, boolean promocao){
        this.nome=nome;
        this.valor=valor;
        this.marca=marca;
    }

    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    //Métodos
    public String detalhes(){
        return "O produto " + this.nome + " está no valor de " +this.valor+ " da marca "+ this.marca+ " promoção "+this.promocao;
    }
}
