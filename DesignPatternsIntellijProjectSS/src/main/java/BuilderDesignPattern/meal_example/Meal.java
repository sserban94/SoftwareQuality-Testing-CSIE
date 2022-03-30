package BuilderDesignPattern.meal_example;

import BuilderDesignPattern.meal_example.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float calculateCost(){
        Double cost = items.stream().mapToDouble(x -> (double) x.price()).sum();
        return cost.floatValue();
    }

    public void showItems() {
        items.stream().forEach(
                x -> {
                    System.out.println("Item: " + x.name() + System.lineSeparator());
                    System.out.println("Packing: " + x.packing().pack() + System.lineSeparator());
                    System.out.println("Price: " + x.price() + System.lineSeparator());
                }
        );
    }
}
