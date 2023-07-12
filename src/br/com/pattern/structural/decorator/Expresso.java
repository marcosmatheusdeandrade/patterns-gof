package br.com.pattern.structural.decorator;

public class Expresso implements Drink {
    @Override
    public void serve() {
        System.out.println("servindo 100ml café expresso..");
    }

    @Override
    public Double getPrice() {
        return 5d;
    }
}
