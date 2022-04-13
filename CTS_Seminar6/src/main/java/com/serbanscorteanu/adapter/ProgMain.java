package com.serbanscorteanu.adapter;

public class ProgMain {
    public static void main(String[] args) {
        int []v = new int[2];
        v[0] = 100;
        v[1] = 150;
        Client client = new Client("Serban", 2, v);
        IDiscountB discount = new AdapterB2A();
        discount.calculateDiscountB(client);
    }
}
