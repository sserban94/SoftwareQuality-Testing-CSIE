package com.serbanscorteanu.creational.singletonSolvedEarly;

public class SingletonSolvedEarly {

    private static SingletonSolvedEarly instance = new SingletonSolvedEarly();

    private SingletonSolvedEarly() {

    }

    public SingletonSolvedEarly getInstance(){
        return instance;
    }
}
