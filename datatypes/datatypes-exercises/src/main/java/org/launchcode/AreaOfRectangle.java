package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, input a length of rectangle: ");
        int length = input.nextInt();

        System.out.println("And now, input a width of rectangle: ");
        int width = input.nextInt();

        System.out.println("The area of the rectangle is " + length * width);
    }

}
