package com.company;

public class Main {

    public static void main(String[] args) {
	Rectangle r1=new Rectangle("red",4,5);
        System.out.println("get Rectanngle area"+" "+r1.getArea());
        System.out.println("--------------------------------------");
        Shape t1=new Triangle("Blue",5,3);
        System.out.println("Get Triangle Area"+" "+ t1.getArea());
        System.out.println("--------------------------------------");
        Shape s=new Triangle("Yellow",5,5);
        System.out.println("Area of"+" "+s.getArea());
        System.out.println("--------------------------------------");
       Shape s1=new Circle("green",4);
        System.out.println(s1.getArea());

    }
}
