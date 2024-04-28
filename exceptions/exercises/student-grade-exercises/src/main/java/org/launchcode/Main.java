package org.launchcode;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
//        System.out.println(Divide(10,0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCodejava");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println("**** Checking File Extensions ****");
        for (Map.Entry<String,String> file : studentFiles.entrySet()) {

            System.out.println( file.getKey() +
                    " gets " + CheckFileExtension(file.getValue())
                    + " points."
            );

        }
    }

    public static int Divide(int x, int y)
    {
        int result = 0;
        // Write code here!
        if (y == 0){
            try {
                throw new ArithmeticException(
                        "Points cannot be zero!"
                );
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            result = x/y;
        }

        return result;
    }

    public static int CheckFileExtension(String fileName)
    {
        int numberOfPointRecieved = 0;
        // Write code here!
        if (isNull(fileName) || fileName.isEmpty()){
            try {
                throw new CheckFileExtensionException("Returns -1; File name can not be NULL or an empty String!");
            } catch (CheckFileExtensionException e) {
                e.printStackTrace();
                numberOfPointRecieved --;
            }
        } else if (!fileName.contains(".java")) {
            numberOfPointRecieved += 0;
        } else {
            numberOfPointRecieved ++;
        }

        return numberOfPointRecieved;
    }
}