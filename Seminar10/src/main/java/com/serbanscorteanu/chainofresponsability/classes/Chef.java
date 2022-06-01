package com.serbanscorteanu.chainofresponsability.classes;

public class Chef extends AHandler{
    @Override
    public void processOrder(Order order) {
        if (order.getDifficulty() > 5) {
            System.out.println("The Chef is handling this: " + order.getName());
        }
    }
}
