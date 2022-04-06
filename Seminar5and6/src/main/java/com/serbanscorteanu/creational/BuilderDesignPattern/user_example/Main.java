package com.serbanscorteanu.creational.BuilderDesignPattern.user_example;

public class Main {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Ion", "Popescu")
                .age(21)
                .phone("0777999333")
                .address("Str. Mihail Kogalniceanu, Vama Veche")
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("James", "Howlet")
                .age(197)
                // no phone
                .address("1407 Graymalkin Lane, Salem Center")
                .build();
        System.out.println(user2);

        User user3 = new User.UserBuilder("Dead", "Pool")
                .build();
        System.out.println(user3);

    }
}
