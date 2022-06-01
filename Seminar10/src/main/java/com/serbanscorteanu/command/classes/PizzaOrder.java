package com.serbanscorteanu.command.classes;

import com.serbanscorteanu.command.interfaces.OrderInterface;

public class PizzaOrder implements OrderInterface {

    private Chef chef;
    private String pizzaType;

    public PizzaOrder(Chef chef, String pizza) {
        this.chef = chef;
        this.pizzaType = pizza;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    @Override
    public void processOrder() {
        this.chef.cookPizza(this.pizzaType);
    }
}
