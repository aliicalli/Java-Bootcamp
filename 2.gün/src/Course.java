public class Course {
    int id;
    String courseName;
    String description;
    double price;
    String instructorName;

    public Course() {
    }

    public Course(int id, String courseName, String description, double price, String instructorName) {
        this.id = id;
        this.courseName = courseName;
        this.description = description;
        this.price = price;
        this.instructorName = instructorName;
    }

}
