package BuilderDesignPattern.meal_example.final_items;

import BuilderDesignPattern.meal_example.items.ColdDrink;

public class CocaCola extends ColdDrink {
    @Override
    public String name() {
        return "CocaCola";
    }

    @Override
    public float price() {
        return 7;
    }
}
