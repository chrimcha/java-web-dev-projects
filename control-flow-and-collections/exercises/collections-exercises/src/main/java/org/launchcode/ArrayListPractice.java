package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        // create and integer ArrayList and hard code 10 integers into list
//        ArrayList<Integer> tenIntArrayList = new ArrayList<>(Arrays.asList(5, 5, 3, 2, 5, 6, 16, 43, 70, 134));

        // or create a loop to add 10 random numbers into an Integer[] (int array variable) to then be added instead of hard coded
        Integer[] otherList = new Integer[10];

        for (int i = 0; i < otherList.length; i++) {
            // assigning a rounded random integer between 0 and 50 into each array index
            otherList[i] = (int)Math.round(Math.random()*51);

            // this is to test what number is going into what index
//            System.out.println("This is index " + i + " and the random number is: " + otherList[i]);
        }

        // prints out the array otherList with the random numbers
//        System.out.println(Arrays.toString(otherList));

        // declaring integer arraylist tenIntArrayList and initializing it with int array otherList
        ArrayList<Integer> tenIntArrayList = new ArrayList<>(Arrays.asList(otherList));

        // initialize accumulator sum as 0
        int sumOfEven = getSumOfEven(tenIntArrayList);

        // print out integer ArrayList tenIntArrayList, length of ArrayList, and sum of all even numbers in ArrayList
        System.out.println("The ArrayList: " + tenIntArrayList + "\n" + "Length of ArrayList: " + tenIntArrayList.size() + "\n" + "Sum of all even numbers in ArrayList: " + sumOfEven);

        // can use an array of strings
        ArrayList<String> randomWords = new ArrayList<>(Arrays.asList("apple", "oranges", "hello", "coffee", "jello"));
        // or use a string that has been converted into an array of strings
        String practiceStr = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        // string converted to arraylist
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(practiceStr.replace(",", " ").replace(".", "").replace("  ", " ").split(" ")));
        System.out.println(myList);

        // called the
        printInputCharWords(myList);
    }

    public static int getSumOfEven(ArrayList<Integer> tenIntArrayList) {
        int sumOfEven = 0;
        // for each integer in the tenIntArraylist, add the integer to sum to find the total of all numbers in ArrayList
        for (Integer integer : tenIntArrayList) {
            if (integer % 2 == 0) {
                // prints out all of the even number from arraylist
//                System.out.println("Even number: " + integer);
                // adds the current integer to the accumulator
                sumOfEven += integer;
                // prints out accumulator
//                System.out.println(sumOfEven);
            }
        }
        return sumOfEven;
    }

    public static void printInputCharWords(ArrayList<String> arrayOfWords) {
        // use if return type is String and not void (1 of 3)
//        String inputLengthWords = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of word: ");
        int wordLength = input.nextInt();
        input.close();

        for (String word : arrayOfWords) {
            if (word.length() == wordLength) {
                // use if return type is String and not void (2 of 3)
//                inputLengthWords = word;

                // println prints each item on a new line, print prints each items on the same line with no space in between
                System.out.println(word);
            }
        }

        // use if return type is String and not void (3 of 3)
//        return inputLengthWords;
    }
}
