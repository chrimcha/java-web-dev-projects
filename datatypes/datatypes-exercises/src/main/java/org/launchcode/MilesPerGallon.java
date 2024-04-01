package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
////my solution doesn't account for decimals because it uses int instead of Double, I also forgot to capitalize my int (not sure if I really need to though)
//        System.out.println("Hello, input number of mile driven: ");
//        int miles = input.nextInt();
//
//        System.out.println("And now, input the amount of gas consumed: ");
//        int gas = input.nextInt();
//
//        System.out.println("For " + miles + " miles and " + gas + " gallons of gas. " + "Miles-per-gallon: " + miles / gas);

////this one is the text book solutions, the solutions above is my original on that does also work
        System.out.println("How many miles have you driven?");
        Double numMiles = input.nextDouble();

        System.out.println("How much gas did you use? In gallons.");
        Double numGallons = input.nextDouble();

        Double mpg = numMiles / numGallons;
        System.out.println("You are running on " + mpg + " mpg.");
    }

}
