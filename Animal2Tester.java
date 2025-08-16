public class Animal2Tester {
    public static void main(String args[]){
        Animal2 a1 = new Animal2();
        System.out.println("1-------------");
        a1.details();
        System.out.println("2-------------");
        Dog2 d1  = new Dog2();
        d1.name = "Pammy";
        System.out.println("3-------------");
        System.out.println("Name: " + d1.getName());
        d1.details();
        System.out.println("4-------------");
        d1.updateSound("Bark");
        System.out.println("5-------------");
        d1.details();
    
    }
    
}
