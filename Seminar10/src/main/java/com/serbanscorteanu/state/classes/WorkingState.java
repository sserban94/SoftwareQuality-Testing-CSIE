package com.serbanscorteanu.state.classes;

import com.serbanscorteanu.state.interfaces.State;

public class WorkingState implements State {
    @Override
    public void act(String task) {
        System.out.println("This employee will handle this task - " + task);
    }
}
