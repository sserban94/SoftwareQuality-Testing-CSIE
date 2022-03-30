package FactoryDesignPattern.shape_example.shapes;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.printf("Inside Square's draw() method");
    }
}
