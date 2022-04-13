package com.serbanscorteanu.adapter;

public class DiscountA implements IDiscountA{
    @Override
    public double calculateDiscountA(int value) {
        if (value > 100) {
            return 0.1;
        }
        if (value > 50 && value <= 100) {
            return 0.5;
        }
        return 0;
    }
}
