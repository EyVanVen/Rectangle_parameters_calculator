package main;

import java.util.*;

public class Rectangle {

    public static void main (String [] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number");
        double side1 = in.nextDouble();

        System.out.println("Enter second number");
        double side2 = in.nextDouble();

        Rectangle shape = new Rectangle();

        shape.areaCalculator(side1,  side2);
        shape.perimeterCalculator(side1, side2);
    }

    public void areaCalculator(double sideA, double sideB){
        System.out.println("Area of the rectangle = " + sideA *  sideB);
    }

    public void perimeterCalculator(double sideA, double sideB){
        System.out.println("Perimeter of the rectangle = " + 2*(sideA +  sideB));
    }
}
