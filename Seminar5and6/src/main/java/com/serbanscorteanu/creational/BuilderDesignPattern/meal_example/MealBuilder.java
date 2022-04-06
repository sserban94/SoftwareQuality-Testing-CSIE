package com.serbanscorteanu.creational.BuilderDesignPattern.meal_example;

import BuilderDesignPattern.meal_example.final_items.CheeseBurger;
import BuilderDesignPattern.meal_example.final_items.CocaCola;
import BuilderDesignPattern.meal_example.final_items.VeggieBurger;

public class MealBuilder {

    public Meal prepareVeggieMeal() {
        Meal meal = new Meal();
        meal.addItem(new VeggieBurger());
        meal.addItem(new CocaCola());
        return meal;
    }

    public Meal prepareNonVeggieMeal() {
        Meal meal = new Meal();
        meal.addItem(new CheeseBurger());
        meal.addItem(new CocaCola());
        return meal;
    }
}
