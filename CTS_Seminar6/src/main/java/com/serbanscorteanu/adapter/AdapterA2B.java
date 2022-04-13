package com.serbanscorteanu.adapter;

public class AdapterA2B extends DiscountB implements IDiscountA{

    @Override
    public double calculateDiscountA(int value) {
        // it doesn't make any sense here - no business logic
        return 0;
    }
}
