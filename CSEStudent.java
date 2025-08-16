public class CSEStudent extends StudentInheritance{
    public static int totalCSEStudents = 0;
    public static String availableLabCourses = "CSE110 CSE111 CSE220 CSE221";
    
    public CSEStudent(String name, int id) {
        super(name, id);
        totalCSEStudents++;
    }
    
    public static void details() {
        System.out.println("Total CSE Students: " + totalCSEStudents);
        System.out.println("Available Lab Based Courses:\n" + availableLabCourses);
    }
    
    public void addLabBasedCourse(String course) {
        if (availableLabCourses.contains(course)) {
            if (courses.isEmpty()) {
                courses = course;
            } else {
                courses += " " + course;
            }
        } else {
            System.out.println("It is not a lab based course!");
        }
    }
}