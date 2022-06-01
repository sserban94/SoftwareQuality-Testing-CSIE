package com.serbanscorteanu.chainofresponsability.main;

import com.serbanscorteanu.chainofresponsability.classes.AHandler;
import com.serbanscorteanu.chainofresponsability.classes.Order;
import com.serbanscorteanu.chainofresponsability.classes.Waiter;
import com.serbanscorteanu.chainofresponsability.classes.Chef;

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("Pizza", 15);
        Order o2 = new Order("Coffee", 3);

        AHandler waiter = new Waiter();
        AHandler chef = new Chef();

        waiter.setSuccessor(chef);

        waiter.processOrder(o1);
        waiter.processOrder(o2);


    }
}
