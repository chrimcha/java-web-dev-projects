package org.launchcode;

import java.util.ArrayList;

public class CourseRunner {

    public static void main(String[] args) {
        //test Student Class data
        Student janeD = new Student("Jane Doe");
        Student joeD = new Student("Joe Doe");
        Student kaleC = new Student("Kale Chips");

        ArrayList<Student> studentsArrayList = new ArrayList<>();
        studentsArrayList.add(janeD);
        studentsArrayList.add(joeD);
        studentsArrayList.add(kaleC);

        //test Teacher Class data
        Teacher bettyB = new Teacher("Betty","Bobbin","Fine Art",25);

        System.out.println("###############################################");
        System.out.println("The Teacher Class works! " + bettyB.getFirstName() + " " + bettyB.getLastName() + " is a Teacher!");
        System.out.println("###############################################");
        System.out.println(bettyB);


        //test Course Class data
        Course homeDecor101 = new Course("Curtains and Blinds", bettyB, studentsArrayList);

        System.out.println("###############################################");
        System.out.println("The Course class works! " + homeDecor101.getTopic() + " is a course Topic!");
        System.out.println("###############################################");
        System.out.println(homeDecor101);
        System.out.println("###############################################");
    }
}