package br.com.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RunFlyWeight {

    private static Map<String, Musica> musicasTocadas = new HashMap<>();

    public static void main(String[] args) {
        playMusic("Unforgiven");
        playMusic("Fade to black");
        playMusic("Back in black");
        playMusic("Unforgiven");
        playMusic("Unforgiven");
        playMusic("Back in black");
        playMusic("Back in black");
        playMusic("Back in black");

        System.out.println("\n Quantidade de músicas carregadas para a memória: "+musicasTocadas.values().size());
    }

    private static void playMusic(String name) {

        Musica musica = musicasTocadas.get(name);
        
        if (musica == null) {
            musica = buscaMusicaNaInternet(name);
            musicasTocadas.put(name, musica);
        }
        musica.tocar();
    }

    private static Musica buscaMusicaNaInternet(String name) {
        return new Musica(new MusicaFlyWeight(name, new Random().nextInt()), 0);
    }
}
