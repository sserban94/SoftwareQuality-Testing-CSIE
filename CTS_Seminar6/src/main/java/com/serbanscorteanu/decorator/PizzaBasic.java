package com.serbanscorteanu.decorator;

public class PizzaBasic extends APizza {
    @Override
    public void getIngredients() {
        System.out.println("dough, ketchup, mozzarella");
    }

    @Override
    public void calculateCost() {
        System.out.println("20 (price)");
    }
}
