package com.serbanscorteanu.wrongWay.liskovSubstitutionGood.solved;

public abstract class Employee {
    private long id;
    private String name;
    private float salary;

    public Employee(){

    }

    public Employee(long id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract float calculateBonus();
}
