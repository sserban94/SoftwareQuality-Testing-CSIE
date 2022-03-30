package FactoryDesignPattern.shape_example.factory;

import FactoryDesignPattern.shape_example.shapes.*;

public class ShapeFactory {


    public static final String CIRCLE = "CIRCLE";
    public static final String RECTANGLE = "RECTANGLE";
    public static final String SQUARE = "SQUARE";
    public static final String TRIANGLE = "TRIANGLE";

    public Shape getShape(String type) {
        if (type == null){
            return null;
        }
        String upperCaseType = type.toUpperCase();
        switch(upperCaseType){
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            case TRIANGLE:
                return new Triangle();
            default:
                return null;
        }
    }
}
