package com.serbanscorteanu.wrongWay.liskovSubstitutionGood.solved;

public class ProgMainO {
    public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee();

        Employee partTimeEmp = new PartTimeEmployee();
    }
}
