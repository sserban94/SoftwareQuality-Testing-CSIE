package com.serbanscorteanu.template.classes;

public abstract class AbstractInsuranceProcedure {

    protected abstract void identifyDamage();
    protected abstract void evaluateDamage();
    protected abstract void sendInsurance();

    public void giveInsuranceTemplateMethod() {
        identifyDamage();
        evaluateDamage();
        sendInsurance();
    }
}
