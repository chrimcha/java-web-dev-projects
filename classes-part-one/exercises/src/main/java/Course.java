import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return "Course Topic: " + getTopic() + "\n" + getInstructor() + "\n" + getEnrolledStudents();
    }
}
