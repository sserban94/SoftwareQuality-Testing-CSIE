package com.serbanscorteanu.wrongWay.liskovSubstitutionGood.solved;

public class PartTimeEmployee extends Employee{
    @Override
    public float calculateBonus() {
        return 0;
    }
}
