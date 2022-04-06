package com.serbanscorteanu.creational.BuilderDesignPattern.meal_example.final_items;

import BuilderDesignPattern.meal_example.items.Burger;

public class CheeseBurger extends Burger {
    @Override
    public String name() {
        return "CheeseBurger";
    }

    @Override
    public float price() {
        return 40;
    }
}
