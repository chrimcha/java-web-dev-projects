public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // constructor allows for the creation of Student objects where the code creating the object provides initial values for each of the fields; would be most useful for creating a transfer student, where credits and a GPA might already be non-zero. However, for all new students, it would be safe to initialize numberOfCredits and gpa to be 0
        public Student(String aName, int aStudentId, int aNumberOfCredits, double aGpa) {
                this.name = aName;
                this.studentId = aStudentId;
                this.numberOfCredits = aNumberOfCredits;
                this.gpa = aGpa;
        }

        // allows for the creation of Student objects with only name and studentId
//        public Student(String name, int studentId) {
//                // use this() to invoke another constructor within the same class. In this case, the second constructor calls the first with the default values for numberOfCredits and gpa, If you use this syntax, the call to this() must be the first line in the constructor.
//                this(name, studentId, 0, 0);
//        }
        //or
//        public Student(String name, int studentId) {
//                this.name = name;
//                this.studentId = studentId;
//                this.numberOfCredits = 0;
//                this.gpa = 0.0;
//        }

        // from text book
//        public Student(String name) {
//                this(name, nextStudentId);
//                nextStudentId++;
//        }
        // from text book
//        public String studentInfo() {
//                return (this.name + " has a GPA of: " + this.gpa);
//        }

        // Drop your getters and setters pair below for the Student class.

        public String getName() {
                return name;
        }
        // or
        /*
        public void setName(String name) {
           this.name = name;
        }
        */

        public void setName(String aName) {
                this.name = aName;
        }
        // or
        /*
        public String getName() {
           return name;
        }
        */

        public int getStudentId() {
                return studentId;
        }

        public void setStudentId(int aStudentId) {
                this.studentId = aStudentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public void setNumberOfCredits(int aNumberOfCredits) {
                this.numberOfCredits = aNumberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        private void setGpa(double aGpa) {
                this.gpa = aGpa;
        }

        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

        @Override
        public String toString() {
                return "Name: " + getName() + "\n ID: " + getStudentId() + "\n Credits: " + getNumberOfCredits() + "\n GPA: " + getGpa();
        }

}
