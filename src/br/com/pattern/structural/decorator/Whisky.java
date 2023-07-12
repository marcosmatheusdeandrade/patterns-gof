package br.com.pattern.structural.decorator;

public class Whisky implements Drink {
    @Override
    public void serve() {
        System.out.println("servindo 100ml de wisky..");
    }

    @Override
    public Double getPrice() {
        return 5d;
    }
}
