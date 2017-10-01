package Notificacoes;


public interface Observable {

    public void addObserver(Observer observer);

    public void removerObserver(Observer observer);

    public void notificarObservers(Video video, Historico historico);
}
