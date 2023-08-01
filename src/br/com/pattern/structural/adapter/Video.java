package br.com.pattern.structural.adapter;

public class Video implements Mp4 {

    private String descricao;
    private int segundos;

    @Override
    public void play() {
        System.out.println("Reproduzindo "+descricao+" em vídeo full hd 4k ");
    }

    public Video(String descricao, int segundos) {
        this.descricao = descricao;
        this.segundos = segundos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
