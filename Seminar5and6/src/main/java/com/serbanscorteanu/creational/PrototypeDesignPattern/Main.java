package com.serbanscorteanu.creational.PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Bookshop carturesti = Bookshop.loadDataFromDb("Carturesti");

        // shallow copy
        Bookshop humanitas = carturesti;

        // deep copy - more efficient instead of
        try {
            Bookshop diverta = (Bookshop) carturesti.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
