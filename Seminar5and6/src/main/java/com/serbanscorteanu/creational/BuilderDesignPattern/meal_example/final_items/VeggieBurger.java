package com.serbanscorteanu.creational.BuilderDesignPattern.meal_example.final_items;

import BuilderDesignPattern.meal_example.items.Burger;

public class VeggieBurger extends Burger {

    @Override
    public String name() {
        return "VeggieBurger";
    }

    @Override
    public float price() {
        return 35;
    }
}
