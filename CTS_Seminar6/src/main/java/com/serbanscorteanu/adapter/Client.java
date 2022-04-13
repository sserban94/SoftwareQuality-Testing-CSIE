package com.serbanscorteanu.adapter;

public class Client {
    private String name;
    private int noOrders;
    private int[] orders;

    public Client(String name, int noOrders, int[] ordersAmount) {
        this.name = name;
        this.noOrders = noOrders;
        this.orders = ordersAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOrders() {
        return noOrders;
    }

    public void setNoOrders(int noOrders) {
        this.noOrders = noOrders;
    }

    public int[] getOrders() {
        return orders;
    }

    public void setOrders(int[] orders) {
        this.orders = orders;
    }
}
