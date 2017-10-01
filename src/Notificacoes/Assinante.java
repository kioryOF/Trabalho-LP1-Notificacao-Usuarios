package Notificacoes;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assinante implements Observer {

    private String nome;
    private boolean sexo; //True para Homem, False para Mulher.
    private static int contCodAssinantes = 0;
    private int codAssinante;

    public Assinante(String nome, boolean sexo) {
        this.nome = nome;
        this.sexo = sexo;
        contCodAssinantes++;
        codAssinante = contCodAssinantes;

    }

    @Override
    public void gerarNotificacao(Video video, Historico historico) {
//Grava informações em um arquivo externo ".txt"
        Scanner entrada = new Scanner(System.in);
        String arquivo = this.nome + ".txt";
        Notificacoes.GravaArquivoTexto gravacao = new Notificacoes.GravaArquivoTexto();
        try {
            gravacao.abreArquivo(arquivo);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao abrir o arquivo.");
        }

        gravacao.gravaDados(this.getTratamento() + " " + this.nome + ", Já está disponível um novo video! \nAssista ao video "
                + video.getTitulo() + " sobre " + video.getDescricao() + ". \nNão esqueça de curtir! \n Bonus de brinde : "
                + this.calculaPontosTotais(historico));

        gravacao.fechaArquivo();
    }

    public static int getContCodAssinantes() {
        return contCodAssinantes;
    }

    public String getNome() {
        return this.nome;

    }

    public String getTratamento() {
        if (this.sexo) {
            return "Senhor";
        } else {
            return "Senhora";
        }

    }

    public boolean getSexo() {
        return sexo;
    }

    public int getCodAssinante() {
        return this.codAssinante;
    }

    public Visita realizarVisita(Historico historico) {
        //Retorna um objeto da classe Visita, verificando se cada elemento é compativel
        int ano, mes, dia;
        int qntVideos;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano da visita (2000 para cima):");
        ano = ChecaData.checaAno(entrada.nextInt());
        System.out.println("Digite o mês da visita :");
        mes = ChecaData.checaMes(entrada.nextInt());
        System.out.println("Digite o dia da visita :");
        dia = ChecaData.checaDia(entrada.nextInt(), mes);
        System.out.println("Digite quantos videos o assinante assistiu nessa visita :");
        qntVideos = entrada.nextInt();
        Visita visita = new Visita(dia, mes, ano, this, qntVideos, historico);

        return visita;
    }

    public int calculaPontosTotais(Historico historico) {
        //Calcula Pontos totais de um assinante
        int total = 0;
        int i;
        for (i = 0; i < historico.getTamanho(); i++) {
            if (this.getCodAssinante() == historico.getHistoricoVisitas().get(i).getAssinante().getCodAssinante()) {
                total += historico.getHistoricoVisitas().get(i).getPontosVisita();

            }

        }
        return total;
    }

}
