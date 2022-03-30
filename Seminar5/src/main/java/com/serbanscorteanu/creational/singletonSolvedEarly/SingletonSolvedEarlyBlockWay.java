package com.serbanscorteanu.creational.singletonSolvedEarly;

public class SingletonSolvedEarlyBlockWay {

    private static SingletonSolvedEarlyBlockWay instance;

    static {
        instance = new SingletonSolvedEarlyBlockWay();
    }

    private SingletonSolvedEarlyBlockWay() {

    }

    public SingletonSolvedEarlyBlockWay getInstance(){
        return instance;
    }
}
