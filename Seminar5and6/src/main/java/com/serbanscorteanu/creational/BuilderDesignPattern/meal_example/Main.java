package com.serbanscorteanu.creational.BuilderDesignPattern.meal_example;

public class Main {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal veggieMeal = mealBuilder.prepareVeggieMeal();
        System.out.println("Veggie meal");
        veggieMeal.showItems();
        System.out.println("Total cost: " + veggieMeal.calculateCost());

        Meal nonVeggieMeal = mealBuilder.prepareNonVeggieMeal();
        System.out.println("NonVeggie meal");
        nonVeggieMeal.showItems();
        System.out.println("Total cost: " + nonVeggieMeal.calculateCost());
    }
}
