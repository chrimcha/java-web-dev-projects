package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userInputString = input.nextLine();
        String testString = userInputString.toLowerCase();

        String replacedNonAlpha = testString.replaceAll("^.[^a-zA-Z0-9 ].$", "");
        //complete this below
//        if  (hasNonAlpha) {
//            do something
//        }

//        boolean hasNonAlpha = s.matches("^.[^a-zA-Z0-9 ].$");

//        String testString = "";

        char[] characterInString = testString.toCharArray();

        for (char character : characterInString) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
            else {
                characterCounts.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }
}