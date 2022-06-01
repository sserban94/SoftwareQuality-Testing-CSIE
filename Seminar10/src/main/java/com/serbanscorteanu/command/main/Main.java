package com.serbanscorteanu.command.main;

import com.serbanscorteanu.command.classes.Chef;
import com.serbanscorteanu.command.classes.PastaOrder;
import com.serbanscorteanu.command.classes.PizzaOrder;
import com.serbanscorteanu.command.classes.Waiter;

public class Main {

    public static void main(String[] args) {
        Chef c1 = new Chef("Michael");
        Chef c2 = new Chef("Rose");

        Waiter w1 = new Waiter();

        w1.noteOrder(new PizzaOrder(c1, "Diavola"));
        w1.noteOrder(new PastaOrder(c2, "Carbonara"));
        w1.noteOrder(new PastaOrder(c1, "Margherita"));

        w1.sendOrders();

    }
}
