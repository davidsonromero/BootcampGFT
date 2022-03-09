package com.metodos;

public class Overload {
    public static void main(String[] args) {
        //Overload means that you can have many methods with the same name but different parameters.
        System.out.println("5x5 Square: " + area(5));
        System.out.println("5x8 Rectangle: " + area(5, 8));
        System.out.println("Trapeze with bases 7 and 5 and height 4: " + area(4, 7, 5));
    }

    public static double area(double height){
        //Square area
        return height * height;
    }

    public static double area(double height, double width){
        //Rectangle area
        return height * width;
    }

    public static double area(double height, double bigBaseWidth, double smallBaseWidth){
        //Trapeze area
        return (bigBaseWidth + smallBaseWidth) * height / 2;
    }
}