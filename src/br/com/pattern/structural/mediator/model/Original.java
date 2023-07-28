package br.com.pattern.structural.mediator.model;

public class Original implements Beer {
    @Override
    public void add(Ingredient ingredient) {
        System.out.println("Adicionando " + ingredient.getQuantity() + "ml de " + ingredient.getClass().getSimpleName() + " na Original..");
    }
}
