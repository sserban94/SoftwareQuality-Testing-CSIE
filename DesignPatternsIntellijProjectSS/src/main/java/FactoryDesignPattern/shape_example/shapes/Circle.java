package FactoryDesignPattern.shape_example.shapes;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.printf("Inside Circle's draw() method");
    }
}
