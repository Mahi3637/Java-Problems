public class CourseTester {
    public static void main(String []args){
        Course c1 = new Course("Programming Language 1", "CSE110", 3);
        Course c2 = new Course("Programming Language 2", "CSE111", 3);
        Course c3 = new Course("Discrete Mathematics", "CSE230", 3);

    
        c1.printDetails();

        System.out.println("!!!!!!!!!!");
        c2.printDetails();

        System.out.println("!!!!!!!!!!");
        c3.printDetails();
    }
}
