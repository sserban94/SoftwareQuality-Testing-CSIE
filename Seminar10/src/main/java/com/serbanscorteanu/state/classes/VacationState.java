package com.serbanscorteanu.state.classes;

import com.serbanscorteanu.state.interfaces.State;

public class VacationState implements State {
    @Override
    public void act(String task) {
        System.out.println("This employee is on vacation. Cannot handle this task - " + task);
    }
}
