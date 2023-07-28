package br.com.pattern.structural.mediator.model;

public abstract class Ingredient {

    protected double quantity;

    public Ingredient(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
