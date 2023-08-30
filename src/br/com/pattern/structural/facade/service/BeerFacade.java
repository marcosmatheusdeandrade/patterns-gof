package br.com.pattern.structural.facade.service;

import br.com.pattern.structural.facade.model.Lupulo;
import br.com.pattern.structural.facade.model.Malte;

public class BeerFacade {

    private LupuloService lupuloService;
    private MalteService malteService;

    public BeerFacade() {
        this.lupuloService = new LupuloService();
        this.malteService = new MalteService();
    }

    public Lupulo getLupulo(Double quantidade) {
        System.out.println("Obtendo " + quantidade + "ml de Lupulo para produção de cerveja.");
        return lupuloService.getLupulo(quantidade);
    }

    public Malte getMalte(Double quantidade) {
        System.out.println("Obtendo " + quantidade + "ml de Malte para produção de cerveja.");
        return malteService.getMalte(quantidade);
    }
}
