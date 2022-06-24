package beans;

public class Conta {
    private int numero;
    private double saldo;
    private String cliente;
    private double limiteEspecial;
    private String tipoConta;


    //Getters e setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public String getTipoConta() {
        return tipoConta;
    }


    //Métodos

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void depositar(double valor){
        this.saldo=this.saldo+ valor;
        extrato();
    }

    public void sacar(double valor){
        if (valor<this.limiteEspecial) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque efetuado no valor de " + valor);
        }else{
            System.out.println("Seu limite é de" +getLimiteEspecial()+", por isso, não será permitido o saque");
        }
        extrato();
    }

    public void extrato(){
        System.out.println("Sua conta é:" +this.numero+ " e seu saldo é de:" +this.saldo+ " o limite é de" +this.limiteEspecial);
    }

    public void definirLimite(double valor){
        if(tipoConta.equalsIgnoreCase("corrente")) {
            this.limiteEspecial = valor;
            System.out.println("Sucesso");
        }else{
            System.out.println("Não tem limite");
        }
    }
    public Conta(int numero, double saldo, String cliente, double limiteEspecial, String tipoConta){}

    public Conta(){}

    public Conta(double sal, double num, String cli, double lim, String tpcont) {}

    public String detalhes(){
        return "O cliente" +this.cliente+ "da conta " +this.numero+ " do tipo " +this.tipoConta+ " tem o saldo de "+this.saldo+ " e limite disponivel de " +this.limiteEspecial;
    }
}
