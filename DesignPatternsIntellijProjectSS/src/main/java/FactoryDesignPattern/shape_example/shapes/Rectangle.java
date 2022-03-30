package FactoryDesignPattern.shape_example.shapes;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.printf("Inside Rectangle's draw() method");
    }
}
