package com.serbanscorteanu.decorator;

public class DecoratorChickenPizza extends DecoratorPizza {

    public DecoratorChickenPizza(APizza aPizza){
        super(aPizza);
    }

    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.println("+ chicken");
    }

    @Override
    public void calculateCost() {
        super.calculateCost();
        System.out.println("+10 (chicken)");
    }


}
