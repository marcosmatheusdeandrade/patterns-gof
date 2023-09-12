package br.com.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class AlbumFigurinha implements Figura {

    private List<Figura> figuras = new ArrayList<>();

    public void add(Figura figura) {
        this.figuras.add(figura);
    }

    public void show() {
        System.out.println("\n Album de figurinhas..");
        System.out.println("  ->");
        figuras.forEach(Figura::show);
    }
}
