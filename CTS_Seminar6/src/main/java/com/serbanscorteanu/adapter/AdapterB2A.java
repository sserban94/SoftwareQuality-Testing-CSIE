package com.serbanscorteanu.adapter;

public class AdapterB2A extends DiscountA implements IDiscountB{
    @Override
    public double calculateDiscountB(Client client) {
//        return this.calculateDiscountA(client.getNoOrders());
//        return 0;

        int total  = 0;
        for (int i = 0; i < client.getNoOrders(); i++){
            total += client.getOrders()[i];
        }
        this.calculateDiscountA(total);
        return 0;
    }
}
