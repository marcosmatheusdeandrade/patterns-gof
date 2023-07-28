package br.com.pattern.structural.mediator;

import br.com.pattern.structural.mediator.model.Beer;
import br.com.pattern.structural.mediator.model.Ingredient;
import br.com.pattern.structural.mediator.model.Lupulo;
import br.com.pattern.structural.mediator.model.Malte;

public class BeerFactoryMediator {
    private Lupulo lupuloOfFactory;
    private Malte malteOfFactory;
    public BeerFactoryMediator(Lupulo lupulo, Malte malte) {
        this.lupuloOfFactory = lupulo;
        this.malteOfFactory = malte;
    }

    void addIngredient(Beer beer, Ingredient ingredient) {
        beer.add(ingredient);
        updateIngredientStock(ingredient);
    }

    private void updateIngredientStock(Ingredient ingredient) {
        System.out.println("Mediator atualizando estoque de ingredientes, sem gerar acoplamento entre objetos..");
        if (ingredient instanceof Lupulo){
            lupuloOfFactory.setQuantity(lupuloOfFactory.getQuantity() - ingredient.getQuantity());
        } else {
            malteOfFactory.setQuantity(malteOfFactory.getQuantity() - ingredient.getQuantity());
        }
    }

}
