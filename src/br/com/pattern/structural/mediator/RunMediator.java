package br.com.pattern.structural.mediator;

import br.com.pattern.structural.mediator.model.*;

public class RunMediator {

    public static void main(String[] args) {

        BeerFactoryMediator beerFactoryMediator = new BeerFactoryMediator(new Lupulo(100000d), new Malte(100000d));
        beerFactoryMediator.addIngredient(new Brahma(), new Lupulo(100d));
        beerFactoryMediator.addIngredient(new Brahma(), new Malte(1000d));
        beerFactoryMediator.addIngredient(new Original(), new Malte(1000d));
    }
}
