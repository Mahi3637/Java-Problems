public class Course {
    public String name;
    public String courseCode;
    public int credit;

    public  Course(String name, String courseCode, int credit){
        this.name = name;
         this.courseCode = courseCode;
         this.credit = credit;
    }

    public void printDetails(){
        System.out.println("Course Name: "+ name);
        System.out.println("Course Code : "+ courseCode);
        System.out.println("Course id: "+ credit);
    }
}
