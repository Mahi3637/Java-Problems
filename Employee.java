public class Employee{
    private String name;
    private int id;
    private String type;
    public int length;

    public Employee(){
        System.out.println("A default employee has been Created");
    }

    public Employee(String name, int id, String type){
        this.name = name;
        this.id = id;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public String getType(){
        return type;
    }
}