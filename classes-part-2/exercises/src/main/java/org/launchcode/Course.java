package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private final String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String topic, Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
    }

    public String getTopic() {
        return topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher aInstructor) {
        this.instructor = aInstructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> aEnrolledStudents) {
        this.enrolledStudents = aEnrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    @Override
    public String toString() {
        return "For this Course, the Topic is " + this.topic +
                ", " + this.instructor +
                ". Enrolled Students: " + this.enrolledStudents +
                '.';
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(topic, course.topic) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor);
    }

    //main method to test Class
//    public static void main(String[] args) {
//        Teacher bettyB = new Teacher("Betty","Bobbin","Fine Art",25);
//
//        Course homeDecor101 = new Course("Curtains and Blinds", bettyB);
//
//        System.out.println("The Course class works! " + homeDecor101.getTopic() + " is a course Topic! \n");
//        System.out.println(homeDecor101);
//    }
}
