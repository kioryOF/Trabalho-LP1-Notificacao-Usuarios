package Comparadores;

import Notificacoes.Visita;

import java.util.Comparator;

public class ComparaDataCrescente implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Visita visita1 = (Visita) o1;
        Visita visita2 = (Visita) o2;
        if (visita1.getAno() > visita2.getAno()) {
            return 1;
        } else {
            if (visita1.getMes() > visita2.getMes()) {
                return 1;
            } else {
                if (visita1.getDia() > visita2.getDia()) {
                    return 1;
                }
            }
        }
        if (visita1.getAno() < visita2.getAno()) {
            return -1;
        } else {
            if (visita1.getMes() < visita2.getMes()) {
                return -1;
            } else {
                if (visita1.getDia() < visita2.getDia()) {
                    return -1;
                }
            }
        }
        return 0;
    }

}
