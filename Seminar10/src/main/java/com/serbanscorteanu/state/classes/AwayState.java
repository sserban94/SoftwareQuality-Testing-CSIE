package com.serbanscorteanu.state.classes;

import com.serbanscorteanu.state.interfaces.State;

public class AwayState implements State {
    @Override
    public void act(String task) {
        System.out.println("This employee is away. Cannot handle this task - " + task);
    }
}
