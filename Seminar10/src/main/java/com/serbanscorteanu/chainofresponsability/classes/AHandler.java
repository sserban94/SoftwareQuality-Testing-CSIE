package com.serbanscorteanu.chainofresponsability.classes;

public abstract class AHandler {

    protected AHandler successor = null;

//    public AHandler(AHandler successor) {
//        this.successor = successor;
//    }

    public abstract void processOrder(Order order);
    public void setSuccessor(AHandler successor){
        this.successor = successor;
    }

}
