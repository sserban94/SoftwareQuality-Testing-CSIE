package com.serbanscorteanu.creational.BuilderDesignPattern.meal_example.items;

import BuilderDesignPattern.meal_example.pack.Bottle;
import BuilderDesignPattern.meal_example.pack.Packing;

public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

}
