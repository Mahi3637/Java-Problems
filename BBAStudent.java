public class BBAStudent {
    private String name;

   
    public BBAStudent() {
        this.name = "Default Name";
    }

 
    public BBAStudent(String name) {
        this.name = name;
    }


    public void details() {
        System.out.println("Name : " + name);
    }
}