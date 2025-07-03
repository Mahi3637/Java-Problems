public class Course {
    public String name;
    public String title;
    public int credit;

    public Course(String name, String title, int Credit){
        this.name = name;
        this.title = title;
        this.credit = credit;
    }

        public void printDetails(){
            System.out.println("The name of the course is: "+name);
            System.out.println("The title of the Course is: "+title);
            System.out.println("The Credit: "+credit);

        }
    }

