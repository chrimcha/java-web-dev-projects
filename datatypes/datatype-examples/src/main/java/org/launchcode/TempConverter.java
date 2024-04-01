package org.launchcode;

//import java.util.Scanner; //uncomment if using Scanner on lines 9 and 15

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
//        Scanner input;
//        or
        java.util.Scanner input;

        input = new java.util.Scanner(System.in);
//        or
//        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close(); //closes Scanner class

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
