public class Instructor extends User {
    private int instructorNumber;
    private String teachedCourse;

    public Instructor() {
    }

    public Instructor(int id, String firstName, String lastName, String email, String identityNumber, int instructorNumber, String teachedCourse) {
        super(id, firstName, lastName, email, identityNumber);
        this.instructorNumber = instructorNumber;
        this.teachedCourse = teachedCourse;
    }

    public int getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(int instructorNumber) {
        this.instructorNumber = instructorNumber;
    }

    public String getTeachedCourse() {
        return teachedCourse;
    }

    public void setTeachedCourse(String teachedCourse) {
        this.teachedCourse = teachedCourse;
    }
}
