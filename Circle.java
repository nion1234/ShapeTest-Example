package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double getArea(){
        return 3.1416*radius;
    }
}
