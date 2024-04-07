import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

import static java.lang.String.valueOf;

public class StudentPractice {
    public static void main(String[] args) {
        //instantiate your Student class below

        // use the Student Class, the new Student contractor that is uncommented out in the Student Class with  all fields as constructor parameters
        Student newStudent = new Student("Christina", 80801, 1, 4.0);

//        System.out.println("The new student is named " + newStudent.getName() + ", her student ID is " + newStudent.getStudentId() + ". She is taking " + newStudent.getNumberOfCredits() + " credit(s) and currently has a " + newStudent.getGpa() + " gpa.");

        Student newStudent2 = new Student("Tortugita", 80802, 10, 4.0);

//        System.out.println("The new student is named " + newStudent2.getName() + ", her student ID is " + newStudent2.getStudentId() + ". She is taking " + newStudent2.getNumberOfCredits() + " credit(s) and currently has a " + newStudent2.getGpa() + " gpa.");

        Student newStudent3 = new Student("Bob", 80803, 5, 3.9);

        ArrayList<Student> studentsArrayList = new ArrayList<>();
        studentsArrayList.add(newStudent);
        studentsArrayList.add(newStudent2);
        studentsArrayList.add(newStudent3);

        // figure out how to print each index of arraylist
//        String[] eachStudent =

        Teacher newTeacher = new Teacher("Peggy", "Peggyton", "Fine Art", 20);

        Course newCourse = new Course("Fiber Technology", newTeacher, studentsArrayList);

//        System.out.println(newCourse);

        System.out.println("For the course topic " + newCourse.getTopic() + ":\n" + newCourse.getInstructor() + "\nand the following " + studentsArrayList.size() + " students are enrolled:\n" + studentsArrayList.get(0) + "\n" + studentsArrayList.get(1) + "\n" + studentsArrayList.get(2));
    }
}
