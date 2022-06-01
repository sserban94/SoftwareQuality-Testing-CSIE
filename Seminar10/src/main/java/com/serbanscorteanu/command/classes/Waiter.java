package com.serbanscorteanu.command.classes;

import com.serbanscorteanu.command.interfaces.OrderInterface;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<OrderInterface> orderList = new ArrayList<>();

    public void noteOrder(OrderInterface command) {
        orderList.add(command);
    }

    public void sendOrders() {
        for (OrderInterface o : orderList) {
            o.processOrder();
        }
        orderList.clear();
    }

}





















