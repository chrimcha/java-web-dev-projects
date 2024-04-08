import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String aTopic, Teacher aInstructor, ArrayList<Student> aEnrolledStudents) {
        this.topic = aTopic;
        this.instructor = aInstructor;
        this.enrolledStudents = aEnrolledStudents;
    }

    public void setTopic(String aTopic) {
        this.topic = aTopic;
    }

    public String getTopic() {
        return topic;
    }

    public void setInstructor(Teacher aInstructor) {
        this.instructor = aInstructor;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setEnrolledStudents(ArrayList<Student> aEnrolledStudents) {
        this.enrolledStudents = aEnrolledStudents;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return "Course Topic: " + getTopic() + "\n" + getInstructor() + "\n" + getEnrolledStudents();
    }
}
