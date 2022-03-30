package BuilderDesignPattern.meal_example.final_items;

import BuilderDesignPattern.meal_example.items.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 8;
    }
}
