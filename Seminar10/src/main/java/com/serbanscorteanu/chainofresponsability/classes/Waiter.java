package com.serbanscorteanu.chainofresponsability.classes;

public class Waiter extends AHandler{
    @Override
    public void processOrder(Order order) {
        if (order.getDifficulty() > 5) {
            System.out.println("The Waiter cannot handle this: " + order.getName());
            this.successor.processOrder(order);
        } else {
            System.out.println("The Waiter is handling this: " + order.getName());
        }
    }
}
