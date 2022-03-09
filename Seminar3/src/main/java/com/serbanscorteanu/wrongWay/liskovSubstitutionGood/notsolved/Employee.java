package com.serbanscorteanu.wrongWay.liskovSubstitutionGood.notsolved;

public class Employee {
    private long id;
    private String name;
    private String employeeType;
    private float salary;

    public Employee(){

    }

    public Employee(long id, String name, float salary, String employeeType) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.employeeType = employeeType;
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

    public float calculateBonus() {
        if(this.employeeType == "FTE"){
            return this.salary*.1f;
        } else {
            return this.salary*.05f;
        }
    }
}
