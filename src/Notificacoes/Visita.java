package Notificacoes;


public class Visita {

    private int ano;
    private int mes;
    private int dia;
    private Assinante assinante;
    private int qntVideos;

    public Visita(int dia, int mes, int ano, Assinante assinante, int qntVideos, Historico historico) {
        this.assinante = assinante;
        this.qntVideos = qntVideos;
        this.ano = ano;
        this.dia = dia;
        this.mes = mes;
        historico.addVisita(this);
    }

    public String getDataVisita() {

        return dia + "/" + mes + "/" + ano;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public Assinante getAssinante() {
        return this.assinante;
    }

    public int getQntVideos() {
        return this.qntVideos;
    }

    public int getPontosVisita() {
        return (qntVideos * 3) + 1;
    }
}
