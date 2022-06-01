package com.serbanscorteanu.state.main;

import com.serbanscorteanu.state.classes.Employee;
import com.serbanscorteanu.state.enums.StateEnum;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setCurrentState(StateEnum.WORKING);
        employee.perform("UX bug");
        employee.setCurrentState(StateEnum.AWAY);
        employee.perform("UX bug");
        employee.setCurrentState(StateEnum.VACATION);
        employee.perform("UX bug");
    }
}
