package br.com.pattern.structural.flyweight;

public class Musica {
    private MusicaFlyWeight musicaFlyWeight;
    private Integer quantidadeExecucoes;

    public Musica(MusicaFlyWeight musicaFlyWeight, Integer quantidadeExecucoes) {
        this.musicaFlyWeight = musicaFlyWeight;
        this.quantidadeExecucoes = quantidadeExecucoes;
    }

    public void tocar() {
        quantidadeExecucoes++;
        System.out.println("Tocando música "+musicaFlyWeight.nome()+"...");
    }

    public MusicaFlyWeight getMusicaFlyWeight() {
        return musicaFlyWeight;
    }

    public void setMusicaFlyWeight(MusicaFlyWeight musicaFlyWeight) {
        this.musicaFlyWeight = musicaFlyWeight;
    }

    public Integer getQuantidadeExecucoes() {
        return quantidadeExecucoes;
    }

    public void setQuantidadeExecucoes(Integer quantidadeExecucoes) {
        this.quantidadeExecucoes = quantidadeExecucoes;
    }
}
