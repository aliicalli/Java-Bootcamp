public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Ali", "Çallı", "alicalli@gmail.com", "123456788957", "Java-React Kurs, Temel Proglamlama", "Java", 11);
        Student student2 = new Student(2, "Ahmet", "Uyan", "ahmetuyan@gmail.com", "69854471278", "C# Kurs,  Javascript", "C#", 16);
        Student student3 = new Student();
        student3.setId(3);
        student3.setFirstName("Agah");
        student3.setLastName("Taş");

        Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "engindemirog@gmail.com", "21314235234", 23, "Java");
        Instructor instructor2 = new Instructor(2, "Aslan", "Kılıç", "aslankilic@gmail.com", "31314235234", 23, "C#");
        System.out.println("--------------");
        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.a(student1);
        System.out.println("--------------");

        Student[] students = {student1, student2,student3};
        for (Student student : students) {
            System.out.println(student.getFirstName() + " / " + student.getLastName() +" / "+ student.getEmail() + " / " + student.getStudentRegisteredCourses());
        }
        System.out.println("----------------------------");

        Instructor[] instructors = {instructor1, instructor2};

        for (Instructor instructor : instructors) {
            System.out.println(instructor.getFirstName() + " / " + instructor.getLastName() + " / " + instructor.getEmail() + " / " + instructor.getTeachedCourse());
        }

        System.out.println("--------------");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);
        instructorManager.b(instructor1);


    }
}
