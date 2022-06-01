package com.serbanscorteanu.classes;

public class Market {
    private String name;
    private float area;
    private TypeMarketEnum type;

    public Market(String name, float area, TypeMarketEnum type) {
        this.name = name;
        this.area = area;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public TypeMarketEnum getType() {
        return type;
    }

    public void setType(TypeMarketEnum type) {
        this.type = type;
    }
}
