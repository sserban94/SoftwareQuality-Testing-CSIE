package com.serbanscorteanu.creational.singleton;



public class SingletonSolvedLazyThreadSafe {
    private static SingletonSolvedLazyThreadSafe instance = new SingletonSolvedLazyThreadSafe();

    private SingletonSolvedLazyThreadSafe() {

    }

    public SingletonSolvedLazyThreadSafe getInstance(){
        if (instance == null){
            // don't use this as this is static - use the actual class
            synchronized (SingletonSolvedLazyThreadSafe.class){
                if (instance == null){
                    instance = new SingletonSolvedLazyThreadSafe();
                }
            }
        }
        return instance;
    }
}
