package BuilderDesignPattern.meal_example.items;

import BuilderDesignPattern.meal_example.pack.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
