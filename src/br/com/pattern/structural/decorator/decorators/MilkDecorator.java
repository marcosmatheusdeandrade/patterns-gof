package br.com.pattern.structural.decorator.decorators;

import br.com.pattern.structural.decorator.Drink;

public class MilkDecorator extends IDrinkDecorator {

    public MilkDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("Adicionado 30ml de leite ao drink");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 0.5;
    }
}
