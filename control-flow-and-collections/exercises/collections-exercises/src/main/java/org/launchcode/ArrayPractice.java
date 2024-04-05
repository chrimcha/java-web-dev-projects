package org.launchcode;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};

        for (int i : intArray) {
            if (intArray[i] % 2 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}
