package Beans;

public class Televisor {
    //Atributos
    private int canal;
    private int volume;
    private boolean ligar;


    //Getters e setters
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume>0 & volume<16 ){
            this.volume = volume;
        }
    }

    public boolean isLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    //Métodos
    public void mostrarStatus(){
        System.out.println("Canal " + getCanal() + ", volume " + getVolume() + "Ligado: " + isLigar());
    }

    public void aumentarVolume(){
        int valor=getVolume()+1;
        setVolume(valor);
    }

    public void diminuirVolume(){
        int valor=getVolume()-1;
        setVolume(valor);
    }

    public void ligar(){
        this.setLigar(true);
    }

    public void desligar(){
        this.setLigar(false);
    }

    public void aumentarCanal(){
        if(this.canal < 16 & this.isLigar()){
            canal++;
        }
    }

    public void diminuirCanal(){
        if(this.canal > 0 & this.isLigar()){
            canal--;
        }
    }
}
