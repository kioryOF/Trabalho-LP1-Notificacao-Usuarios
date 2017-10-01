/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import Notificacoes.Visita;
import java.util.Comparator;

/**
 *
 * @author Vitor
 */
public class ComparaQntVideosCrescente implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Visita visita1 = (Visita) o1;
        Visita visita2 = (Visita) o2;
        if (visita1.getQntVideos() > visita2.getQntVideos()) {
            return 1;
        }
        if (visita1.getQntVideos() < visita2.getQntVideos()) {
            return -1;
        }
        return 0;
    }
}
