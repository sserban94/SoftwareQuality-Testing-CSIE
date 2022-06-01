package com.serbanscorteanu.command.classes;

import com.serbanscorteanu.command.interfaces.OrderInterface;

public class PastaOrder implements OrderInterface {

    private Chef chef;
    private String pastaType;

    public PastaOrder(Chef chef, String pastaType) {
        this.chef = chef;
        this.pastaType = pastaType;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getPastaType() {
        return pastaType;
    }

    public void setPastaType(String pastaType) {
        this.pastaType = pastaType;
    }

    @Override
    public void processOrder() {
        this.chef.cookPasta(this.pastaType);
    }
}
