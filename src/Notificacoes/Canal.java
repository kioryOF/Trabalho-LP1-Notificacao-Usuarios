package Notificacoes;


import java.util.ArrayList;
import java.util.Scanner;

public class Canal implements Observable {

    private ArrayList<Observer> listaObserver = new ArrayList<Observer>();
    private String nomeCanal;
    private ArrayList<Video> listaVideos = new ArrayList<Video>();

    public Canal(String nome) {
        this.nomeCanal = nome;
    }

    @Override
    public void addObserver(Observer observer) {
        //Adiciona um Observer para o arraylist
        listaObserver.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        listaObserver.remove(observer);
    }

    @Override
    public void notificarObservers(Video video, Historico historico) {
        //Manda uma notificação para cada Observer na Lista
        int i;
        for (i = 0; i < listaObserver.size(); i++) {
            listaObserver.get(i).gerarNotificacao(video,historico);

        }
    }

    public void addVideo(Historico historico) {
        //Adiciona um video ao canal
        String nomeVideo, descricaoVideo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do video :");
        nomeVideo = entrada.nextLine();
        System.out.println("Digite a descrição do video :");
        descricaoVideo = entrada.nextLine();
        Video v1 = new Video(nomeVideo, descricaoVideo);
        listaVideos.add(v1);
        this.notificarObservers(v1, historico);
    }

    public String getNome() {
        return this.nomeCanal;
    }

    public ArrayList<Video> getListaVideos() {
        return (ArrayList<Video>) this.listaVideos.clone();
    }

    public ArrayList<Observer> gerListaObserver() {
        return (ArrayList<Observer>) this.listaObserver.clone();
    }
}
