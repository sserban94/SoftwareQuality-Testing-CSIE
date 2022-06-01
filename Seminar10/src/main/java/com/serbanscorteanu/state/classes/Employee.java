package com.serbanscorteanu.state.classes;

import com.serbanscorteanu.state.enums.StateEnum;
import com.serbanscorteanu.state.interfaces.State;

import javax.naming.OperationNotSupportedException;

public class Employee {
    State currentState;

//    public Employee(State currentState) {
//        this.currentState = currentState;
//    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(StateEnum currentState) {
        switch(currentState){
            case AWAY:
                this.currentState = new AwayState();
                break;
            case VACATION:
                this.currentState = new VacationState();
                break;
            case WORKING:
                this.currentState = new WorkingState();
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public void perform(String task){
        this.currentState.act(task);
    }
}
