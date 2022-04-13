package com.serbanscorteanu.decorator;

public class DecoratorPizza extends APizza {

    // concrete object
    protected APizza aPizza;

    public DecoratorPizza(APizza aPizza) {
        // super();
        this.aPizza = aPizza;
    }

    @Override
    public void getIngredients() {
        aPizza.getIngredients();
    }

    @Override
    public void calculateCost() {
        aPizza.calculateCost();
    }
}
