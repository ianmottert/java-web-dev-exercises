package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws Exception {
        double radius;
        boolean verified = false;

        while (!verified) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a radius: ");
            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                if (radius > 0) {
                    verified = true;
                    double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is " + area + ".");
                } else {
                    throw new Exception("Must be a positive number.");
                }
            } else {
                throw new Exception("Must be a number.");
            }
        }





    }
}
