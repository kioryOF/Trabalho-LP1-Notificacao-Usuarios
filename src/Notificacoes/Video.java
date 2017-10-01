package Notificacoes;


public class Video {

    private String titulo;
    private String descricao;

    public Video(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;

    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
