public class StudentInheritance {
    public String name;
  public int id;
  public String courses = "";
  
  public StudentInheritance(String n, int i){
    this.name = n;
    this.id = i;
  }
  
  public void info(){
    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("Courses: "+courses);
  }

}
