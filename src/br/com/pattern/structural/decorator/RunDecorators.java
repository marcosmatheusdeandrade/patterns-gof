package br.com.pattern.structural.decorator;

import br.com.pattern.structural.decorator.decorators.DoubleDrinkDecorator;
import br.com.pattern.structural.decorator.decorators.MilkDecorator;

public class RunDecorators {

    public static void main(String[] args) {
        DoubleDrinkDecorator doubleDrink = new DoubleDrinkDecorator(new MilkDecorator(new Whisky()));
        doubleDrink.serve();
        System.out.println(doubleDrink.getPrice());


        MilkDecorator milkDecorator = new MilkDecorator(new Expresso());
        milkDecorator.serve();
        System.out.println(milkDecorator.getPrice());
    }
}
