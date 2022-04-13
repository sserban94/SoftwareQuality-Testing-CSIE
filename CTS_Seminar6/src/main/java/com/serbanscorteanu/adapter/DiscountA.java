package com.serbanscorteanu.adapter;

public class DiscountA implements IDiscountA{
    @Override
    public double calculateDiscountA(int noOrders) {
        if (noOrders > 100) {
            return 0.1;
        }
        if (noOrders > 50 && noOrders <= 100) {
            return 0.5;
        }
        return 0;
    }
}
