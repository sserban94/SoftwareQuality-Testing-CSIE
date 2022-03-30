package FactoryDesignPattern.shape_example;

import FactoryDesignPattern.shape_example.factory.ShapeFactory;
import FactoryDesignPattern.shape_example.shapes.Shape;

public class FactoryMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // now creating a Circle and calling draw()
        Shape firstShape = factory.getShape("circle");
        firstShape.draw();
        System.out.println();

        // creating a Rectangle
        Shape secondShape = factory.getShape("rectangle");
        secondShape.draw();
        System.out.println();

        // creating a Square
        Shape thirdShape = factory.getShape("square");
        thirdShape.draw();
        System.out.println();

        // creating a Triangle
        Shape forthShape = factory.getShape("triangle");
        forthShape.draw();
        System.out.println();
    }
}
