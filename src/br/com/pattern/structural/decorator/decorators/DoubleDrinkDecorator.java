package br.com.pattern.structural.decorator.decorators;

import br.com.pattern.structural.decorator.Drink;

public class DoubleDrinkDecorator extends IDrinkDecorator {

    public DoubleDrinkDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        drink.serve();
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() * 2;
    }
}
