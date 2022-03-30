package FactoryDesignPattern.shape_example.shapes;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.printf("Inside Triangle's draw() method");
    }
}
