package org.launchcode;

import jdk.jshell.spi.SPIResolutionException;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        //create and initialize array in one line
        int[] intArray = {1, 1, 2, 3, 5, 8};
//        or
//        int[] intArray = new int[]{1, 1, 2, 3, 5, 8};

        // for each value (int i) in intArray, if the value divided by 2 has a remainder 1, then it is odd and will print
        for (int i : intArray) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        // store a string in a variable
        String practiceStr = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        // create a string array variable to hold the practiceStr that is split into strings at each space
        String[] splitPracticeStr = practiceStr.split(" ");

        // print out the new array of strings
        System.out.println(Arrays.toString(splitPracticeStr));

        // regex for splitting at period / "." / dot
        String[] splitAtPeriods = practiceStr.split("\\.");
        System.out.println(Arrays.toString(splitAtPeriods));


    }
}
