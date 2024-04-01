package org.launchcode;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        String firstSentenceAliceWonderland =
                "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                        "and of having nothing to do: " +
                        "once or twice she had peeped into the book her sister was reading, " +
                        "but it had no pictures or conversations in it, " +
                        "‘and what is the use of a book,’ " +
                        "thought Alice ‘without pictures or conversation?’";
        firstSentenceAliceWonderland = firstSentenceAliceWonderland.toUpperCase();

        Scanner input = new Scanner(System.in);

        System.out.println("Please pick a term to search: ");
        String searchTerm = input.nextLine();

        boolean findTerm = firstSentenceAliceWonderland.contains(searchTerm.toUpperCase());

        int termIndex = firstSentenceAliceWonderland.indexOf(searchTerm.toUpperCase());
        int termLength = searchTerm.length();
        String modifiedSentence = firstSentenceAliceWonderland.replace(searchTerm.toUpperCase(), "");
        modifiedSentence = modifiedSentence.toLowerCase().replace("alice", "Alice");
        modifiedSentence = modifiedSentence.replace("  ", " ");

        System.out.println("Term searched: " + searchTerm + "\n" + "Was term found: " + findTerm + "\n" + "Term index (first occurrence): " + termIndex + "\n" + "Term length: " + termLength + "\n" + "Modified string with '" + searchTerm + "' removed: " + modifiedSentence);
    }

}
