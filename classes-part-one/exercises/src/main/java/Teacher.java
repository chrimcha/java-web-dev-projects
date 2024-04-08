public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String aFirstName, String aLastName, String aSubject, int aYearsTeaching) {
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.subject = aSubject;
        this.yearsTeaching = aYearsTeaching;
    }

    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }

    public String getSubject() {
        return subject;
    }

    public void setYearsTeaching(int aYearsTeaching) {
        this.yearsTeaching = aYearsTeaching;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    @Override
    public String toString() {
        return "Instructor Info:\n Name: " + getFirstName() + " " + getLastName() + "\n Subject: " + getSubject() + "\n Years Teaching: " + getYearsTeaching();
    }
}
