package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius");
        Double numRadius = input.nextDouble();

        Double circleArea = Circle.getArea(numRadius);
        System.out.println("The area of a circle of radius " + numRadius + " is: " + circleArea);
    }
}
