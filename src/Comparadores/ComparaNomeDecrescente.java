package Comparadores;

import Notificacoes.Visita;

import java.util.Comparator;

public class ComparaNomeDecrescente implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Visita visita1 = (Visita) o1;
        Visita visita2 = (Visita) o2;
        return -1 * visita1.getAssinante().getNome().compareTo(visita2.getAssinante().getNome());
    }
}
