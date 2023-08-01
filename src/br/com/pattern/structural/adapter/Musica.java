package br.com.pattern.structural.adapter;

public class Musica {

    private String descricao;
    private int segundos;

    public Musica(String descricao, int segundos) {
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
