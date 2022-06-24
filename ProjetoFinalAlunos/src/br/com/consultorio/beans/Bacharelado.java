package br.com.consultorio.beans;

public class Bacharelado extends Formacao {
    private short cargaHorarioEstagio;
    private String projetoConclusao;

    public Bacharelado(){}

    public Bacharelado(String descricao, int duracao, float mensalidade, short periodo, short cargaHorarioEstagio, String projetoConclusao) {
        super(descricao, duracao, mensalidade, periodo);
        this.cargaHorarioEstagio = cargaHorarioEstagio;
        this.projetoConclusao = projetoConclusao;
    }

    public short getCargaHorarioEstagio() {
        return cargaHorarioEstagio;
    }

    public void setCargaHorarioEstagio(short cargaHorarioEstagio) {
        this.cargaHorarioEstagio = cargaHorarioEstagio;
    }

    public String getProjetoConclusao() {
        return projetoConclusao;
    }

    public void setProjetoConclusao(String projetoConclusao) {
        this.projetoConclusao = projetoConclusao;
    }

    @Override
    public void calcularMensalidade(double fator) {
        setMensalidade((getMensalidade()*fator*200)+(cargaHorarioEstagio*12));
    }

    @Override
    public void definirDuracao() {
        if(getDescricao().equalsIgnoreCase("engenharia")){
            setDuracao(48);
        } else{
            setDuracao(60);
        }
    }
}
