package br.com.pattern.structural.adapter;

public class Mp3ToMp4Adapter implements Mp4 {

    private Musica musica;

    public Mp3ToMp4Adapter(Musica musica) {
        this.musica = musica;
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo "+musica.getDescricao()+", sem imagem, somente música..");
    }
}
