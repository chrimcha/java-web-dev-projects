package org.launchcode;

import java.util.Objects;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    //constructor
    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    //getters and setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    //overrides


    @Override
    public String toString() {
        return "The Teacher's Name is " + firstName + " " + lastName +
                ", their Subject is " + subject +
                ", and they have been Teaching for " + yearsTeaching +
                " Years";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return yearsTeaching == teacher.yearsTeaching && Objects.equals(firstName, teacher.firstName) && Objects.equals(lastName, teacher.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, yearsTeaching);
    }

    //main method to run Class for tests
//    public static void main(String[] args) {
//        Teacher bettyB = new Teacher("Betty","Bobbin","Fine Art",25);
//        System.out.println("The Teacher class works! " + bettyB.getFirstName() + ", " + bettyB.lastName + " is a Teacher!");
//        System.out.println(bettyB);
//    }
}
