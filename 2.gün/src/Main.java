public class Main {

    public static void main(String[] args) {
        //kodlama io da bir curses ve intructorlar var bunları simule etmeyi deneyeceğim şimdi.

        Course course1 = new Course(1, "Yazılım Geliştirme Kampı", "30 günlük bir kamp sonrasında temel bir seviyede yazılım geliştrime bakış açısı kazanacaksınız", 25, "Engin Demiroğ");
        Course course2 = new Course(1, "Java Geliştimre Kampı", "30 günlük bir kamp sonrasında temel bir seviyede yazılım geliştrime bakış açısı kazanacaksınız", 25, "Engin Demiroğ");
        Course[] courses = {course1, course2};
        CourseManager courseManager = new CourseManager();
        courseManager.add(course1);
        courseManager.update(course2);

        for (Course course : courses) {
            System.out.println("-----------------------------");
            System.out.println(course.courseName + " / " + course.instructorName + " / " + course.price);
            System.out.println("-----------------------------");
        }

        Category category1 = new Category(1, "Java");
        Category category2 = new Category(2, "PHP");

        Category[] categorys = {category1, category2};

        for (Category category : categorys) {
            System.out.println(category.id +" / "+ category.CategoryName);
        }


    }
}
