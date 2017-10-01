package Notificacoes;

import Comparadores.ComparaDataCrescente;
import Comparadores.ComparaDataDecrescente;
import Comparadores.ComparaNomeCrescente;
import Comparadores.ComparaNomeDecrescente;
import Comparadores.ComparaQntVideosCrescente;
import Comparadores.ComparaQntVideosDecrescente;
import java.util.ArrayList;
import java.util.Collections;

public class Historico {

    static private ArrayList<Visita> historicoVisitas = new ArrayList<Visita>();

    public Historico() {
    }

    public void addVisita(Visita visita) {
        historicoVisitas.add(visita);
    }

    public int getTamanho() {
        return historicoVisitas.size();
    }

    public ArrayList<Visita> getHistoricoVisitas() {
        return (ArrayList<Visita>) historicoVisitas.clone();
    }

    public void exibeHistoricoPorVideosDecrescente() {
        System.out.println("**** Historico por Visitas com mais Videos Decrescente *******");
        ComparaQntVideosDecrescente c = new ComparaQntVideosDecrescente();
        ArrayList<Visita> historico = (ArrayList<Visita>) historicoVisitas.clone();
        Collections.sort(historico, c);
        this.exibeHistoricoGeral(historico);
        System.out.println("\n");
    }

    public void exibeHistoricoPorVideosCrescente() {
        System.out.println("**** Historico por Visitas com mais Videos Crescente *******");
        ComparaQntVideosCrescente c = new ComparaQntVideosCrescente();
        ArrayList<Visita> historico = (ArrayList<Visita>) historicoVisitas.clone();
        Collections.sort(historico, c);
        this.exibeHistoricoGeral(historico);
        System.out.println("\n");
    }

    public void exibeHistoricoDataCrescente() {
        System.out.println("**** Historico por Visitas Data Crescente *******");
        ComparaDataCrescente c = new ComparaDataCrescente();
        ArrayList<Visita> historico = (ArrayList<Visita>) historicoVisitas.clone();
        Collections.sort(historico, c);
        this.exibeHistoricoGeral(historico);
        System.out.println("\n");
    }

    public void exibeHistoricoDataDecrescente() {
        System.out.println("**** Historico por Visitas Data Decrescente *******");
        ComparaDataDecrescente c = new ComparaDataDecrescente();
        ArrayList<Visita> historico = (ArrayList<Visita>) historicoVisitas.clone();
        Collections.sort(historico, c);
        this.exibeHistoricoGeral(historico);
        System.out.println("\n");
    }

    public void exibeHistoricoPorNomeCrescente() {
        System.out.println("**** Historico por Visita Nome Crescente *******");
        ComparaNomeCrescente c = new ComparaNomeCrescente();
        ArrayList<Visita> historico = (ArrayList<Visita>) historicoVisitas.clone();
        Collections.sort(historico, c);
        this.exibeHistoricoGeral(historico);
        System.out.println("\n");
    }

    public void exibeHistoricoPorNomeDecrescente() {
        System.out.println("**** Historico por Visitas Nome Decrescente *******");
        ComparaNomeDecrescente c = new ComparaNomeDecrescente();
        ArrayList<Visita> historico = (ArrayList<Visita>) historicoVisitas.clone();
        Collections.sort(historico, c);
        this.exibeHistoricoGeral(historico);
        System.out.println("\n");

    }

    private void exibeHistoricoGeral(ArrayList<Visita> historico) {
        int i;
        for (i = 0; i < this.getTamanho(); i++) {
            System.out.println("Nome do assinante : " + historico.get(i).getAssinante().getNome());
            System.out.println("Data visita : " + historico.get(i).getDataVisita());
            System.out.println("Videos vistos na visita : " + historico.get(i).getQntVideos());
            System.out.println("--------------------");

        }
    }

}
