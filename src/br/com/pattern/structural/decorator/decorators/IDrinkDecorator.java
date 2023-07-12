package br.com.pattern.structural.decorator.decorators;

import br.com.pattern.structural.decorator.Drink;

public abstract class IDrinkDecorator implements Drink {

    protected Drink drink;

    public IDrinkDecorator(Drink drink) {
        this.drink = drink;
    }
}
