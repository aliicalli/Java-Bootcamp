public class Student extends User {
    private String courseTaken;
    private int studentNumber;
    private String studentRegisteredCourses;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String eMail, String identityNumber, String studentRegisteredCourses, String courseTaken, int studentNumber) {
        super(id, firstName, lastName, eMail, identityNumber);
        this.courseTaken = courseTaken;
        this.studentNumber = studentNumber;
        this.studentRegisteredCourses = studentRegisteredCourses;
    }

    public String getCourseTaken() {
        return courseTaken;
    }

    public void setCourseTaken(String courseTaken) {
        this.courseTaken = courseTaken;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentRegisteredCourses() {
        return studentRegisteredCourses;
    }

    public void setStudentRegisteredCourses(String studentRegisteredCourses) {
        this.studentRegisteredCourses = studentRegisteredCourses;
    }
}
