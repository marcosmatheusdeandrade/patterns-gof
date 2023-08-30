package br.com.pattern.structural.facade;

import br.com.pattern.structural.facade.service.BeerFacade;

public class RunFacade {

    public static void main(String[] args) {
        BeerFacade beerFacade = new BeerFacade();
        beerFacade.getMalte(10d);
        beerFacade.getLupulo(10d);
    }
}
