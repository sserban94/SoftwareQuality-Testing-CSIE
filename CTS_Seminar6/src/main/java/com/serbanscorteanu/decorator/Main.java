package com.serbanscorteanu.decorator;

public class Main {
    public static void main(String[] args) {
        APizza pizzaBasic = new PizzaBasic();
        System.out.println("Pizza basic");
        pizzaBasic.getIngredients();
        pizzaBasic.calculateCost();

        APizza aPizza = new DecoratorChickenPizza(pizzaBasic);
        System.out.println("Chicken pizza");
        aPizza.getIngredients();
        aPizza.calculateCost();
    }
}
