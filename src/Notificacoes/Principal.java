package Notificacoes;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Canal youtube = new Canal("Youtube");//Cria o canal

        Historico papelada = new Historico();//Cria o historico

        Assinante mario = new Assinante("Mario", true);
        Assinante julia = new Assinante("Julia", false);//Cria os assinantes

        youtube.addObserver(mario);
        youtube.addObserver(julia);//Adiciona os assinantes à lista de observadores

        Visita visita1 = mario.realizarVisita(papelada);//Realiza uma visita para o assinante mario

        exibePontos(mario, papelada);//Exibe os pontos do assinante mario

        youtube.addVideo(papelada);//Adiciona um video ao canal youtube

        Visita visita2 = julia.realizarVisita(papelada);//Realiza uma visita para o assinante julia

        exibePontos(mario, papelada);//Exibe os pontos do assinante mario

        exibePontos(julia, papelada);//Exibe os pontos do assinante julia

        imprimir(mario, papelada);//Exibe os dados do assinante mario

        imprimir(julia, papelada);//Exibe os dados do assinante julia

        papelada.exibeHistoricoDataCrescente();
        papelada.exibeHistoricoDataDecrescente();
        papelada.exibeHistoricoPorNomeCrescente();
        papelada.exibeHistoricoPorNomeDecrescente();
        papelada.exibeHistoricoPorVideosCrescente();
        papelada.exibeHistoricoPorVideosDecrescente();//Exibe o historico por condições(sem quebra de encapsulamento). 

    }

    private static void imprimir(Assinante assinante, Historico historico) {
        System.out.println("\nNome : " + assinante.getNome());
        if (assinante.getSexo()) {
            System.out.println("Sexo masculino ");
        } else {
            System.out.println("Sexo Feminino");
        }
        System.out.println("Pontos :" + assinante.calculaPontosTotais(historico));
        System.out.println("Codigo assinante: " + assinante.getCodAssinante());
        System.out.println("---------------");

    }

    private static void exibePontos(Assinante assinante, Historico historico) {
        System.out.println("Pontos totais de " + assinante.getNome() + " sao :" + assinante.calculaPontosTotais(historico));
    }

    private static int perguntaQntVizualizacoes(Assinante assinante) {
        int vizualizacoes;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero de vizualizaçoes que " + assinante.getNome() + " fara :");
        vizualizacoes = entrada.nextInt();
        return vizualizacoes;
    }

}
