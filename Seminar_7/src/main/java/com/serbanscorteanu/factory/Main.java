package com.serbanscorteanu.factory;

public class Main {
    public static void main(String[] args) {
//        Factory factory = new Factory();
//
//        IWeapon weapon = factory.getWeapon(300);
//        weapon.power();

        // FACTORY METHOD
        IFactory factory = new CheapFactory();
        IWeapon weapon = factory.getWeapon(0);
        weapon.power();
    }
}
