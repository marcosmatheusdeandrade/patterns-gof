package br.com.pattern.structural.adapter;

public class RunAdapter {

    public static void main(String[] args) {
        Video metallicaLive = new Video("Metallica live", 100);
        Musica scorpions = new Musica("Scorpions", 60);

        PlayerMp4 playerMp4 = new PlayerMp4();

        playerMp4.play(metallicaLive);
        playerMp4.play(new Mp3ToMp4Adapter(scorpions));
    }
}
