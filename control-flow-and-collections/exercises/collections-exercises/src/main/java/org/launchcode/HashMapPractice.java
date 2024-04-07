package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        // declare and initilize HashMap with the key as the ID (Integer) and the value as the name (String)
        HashMap<Integer, String> students = new HashMap<>();

        // use Scanner to get user input
        Scanner input = new Scanner(System.in);

        // declare String variable to store user input for student ID
        String newStudentID;

        System.out.println("Enter your students ID (or ENTER to finish): ");

        // get student ID's and names
        do {

            System.out.print("Student ID: ");
            // assignment user input to newStudentID
            newStudentID = input.nextLine();

            // if newStudentID is not empty, then user inputs student name, then the ID; key/value pair is added to students HashMap
            if (!newStudentID.equals("")) {
                System.out.print("Student Name: ");

                // declare and initialize String variable to store user input for student name
                String newStudent = input.nextLine();

                // add the key/value pair to the HashMap, converted the String value of the ID user input into an Integer to be able to use in the HashMap
                students.put(Integer.valueOf(newStudentID), newStudent);

            }

        } while (!newStudentID.equals(""));

        input.close();

        // print class roster
        System.out.println("\nClass Roster: ");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("[ID: " + student.getKey() + "] Student Name: " + student.getValue());
        }

        System.out.println("Number of students in roster: " + students.size());
    }
}
