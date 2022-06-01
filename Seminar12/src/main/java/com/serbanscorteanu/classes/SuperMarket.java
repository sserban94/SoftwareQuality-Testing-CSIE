package com.serbanscorteanu.classes;

import com.serbanscorteanu.exceptions.NoMarketTypeException;

import java.util.List;

public class SuperMarket {
    private String name;
    // private int area;    // deterministic - should be calculated
    private List<Market> markets;

    public SuperMarket(String name, List<Market> markets) {
        this.name = name;
        this.markets = markets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

    public String getBiggestMarketByArea(TypeMarketEnum type) throws NoMarketTypeException {
        if (markets == null || markets.isEmpty()) {
            throw new NoMarketTypeException();
        }
        float areaMax = -1;
        String nameMaxMarket = "";
        for (int i = 0; i < this.markets.size(); i++){
            if (areaMax < this.markets.get(i).getArea() && this.markets.get(i).getType() == type) {
                areaMax = this.markets.get(i).getArea();
                nameMaxMarket = this.markets.get(i).getName();
            }
        }
        return nameMaxMarket;
    }
}


















