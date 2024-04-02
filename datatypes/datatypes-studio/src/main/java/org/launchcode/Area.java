package org.launchcode;

import java.util.Scanner;
import static org.launchcode.Circle.getArea;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        input.close();

//commented out code below was used to calculate area and declare pi int before adding another Class to handle the calculations
//        double pi = 3.14;
//        double area = pi * radius * radius;

        double area = getArea(radius);
//        or
//        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
