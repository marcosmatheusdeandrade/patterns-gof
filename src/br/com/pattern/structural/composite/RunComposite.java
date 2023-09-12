package br.com.pattern.structural.composite;

public class RunComposite {

    public static void main(String[] args) {
        FigurinhaBatman figuraBatman = new FigurinhaBatman();
        FigurinhaSuperMan figuraSuperMan = new FigurinhaSuperMan();

        AlbumFigurinha albumFigurinha = new AlbumFigurinha();
        albumFigurinha.add(figuraBatman);
        albumFigurinha.add(figuraSuperMan);

        AlbumFigurinha albumFigurinhaNovo = new AlbumFigurinha();
        albumFigurinhaNovo.add(figuraBatman);

        albumFigurinha.add(albumFigurinhaNovo);

        albumFigurinha.show();
    }
}
