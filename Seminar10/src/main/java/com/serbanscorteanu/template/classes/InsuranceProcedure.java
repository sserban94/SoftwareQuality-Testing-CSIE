package com.serbanscorteanu.template.classes;

public class InsuranceProcedure extends AbstractInsuranceProcedure{
    @Override
    protected void identifyDamage() {
        System.out.println("I am identifying the damage");
    }

    @Override
    protected void evaluateDamage() {
        System.out.println("I am evaluating the damage");
    }

    @Override
    protected void sendInsurance() {
        System.out.println("I am sending the insurance");
    }
}
