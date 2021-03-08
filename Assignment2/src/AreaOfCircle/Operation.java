package AreaOfCircle;

import java.util.Scanner;

public class Operation {
    public void Operation(){
        System.out.println("enter your radius");
        Scanner aka = new Scanner(System.in);
        double radius = aka.nextFloat(); // you can use nextDouble() method in Java
        double Area = Math.PI * Math.pow(radius,2);
        System.out.println("the area of circle with radius "+radius+" is "+Area);
    }
}
