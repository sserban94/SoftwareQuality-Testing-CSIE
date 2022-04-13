package com.serbanscorteanu.adapter;

public class Client {
    String name;
    int ceva;
    int[] cevaArray;

    public Client(String name, int ceva, int[] cevaArray) {
        this.name = name;
        this.ceva = ceva;
        this.cevaArray = cevaArray;
    }

    public int getNoOrders() {
        return 0;
    }

    public int[] getOrders() {
        return new int[]{0};
    }
}
