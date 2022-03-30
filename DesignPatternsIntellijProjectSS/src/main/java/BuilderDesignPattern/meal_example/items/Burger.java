package BuilderDesignPattern.meal_example.items;

import BuilderDesignPattern.meal_example.pack.Packing;
import BuilderDesignPattern.meal_example.pack.Wrapper;

public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }


}
