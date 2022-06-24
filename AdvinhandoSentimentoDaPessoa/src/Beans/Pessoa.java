package Beans;

public class Pessoa {
    // Atributos
    private int id;
    private String nome;
    private int idade;
    private String cidade;
    private String sentimento;

    //Getters e setters
    public void setIdade( int idade){
        if(idade < 0){
            this.idade = 0;
        } else {
            this.idade = idade;
        }
    }

    public int getIdade(){
        return this.idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSentimento() {
        return sentimento;
    }

    public void setSentimento(String sentimento) {
        this.sentimento = sentimento;
    }

    //Metodos e atribuições
    public void Comer(String refeicao){
        System.out.println("Tipo de refeição:" + refeicao);
        this.sentimento="Relaxado e tranquilo";
    }

    public void Dormir(int tempo){
        System.out.println("Tempo de sono: "+ tempo);

        if (tempo<=5){
            this.sentimento = "Cansaço";
        } else{
            this.sentimento= "Descansado";
        }
    }

}

