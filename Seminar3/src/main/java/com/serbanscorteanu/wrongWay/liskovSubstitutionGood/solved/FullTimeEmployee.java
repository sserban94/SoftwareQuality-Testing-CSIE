package com.serbanscorteanu.wrongWay.liskovSubstitutionGood.solved;

public class FullTimeEmployee extends Employee{
    @Override
    public float calculateBonus() {
        return 0;
    }
}
