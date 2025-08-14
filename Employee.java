public class Employee {
     public String name;
     public double salary;
     public String designation;

     public void newEmployee(String name){
        this.name = name;
        this.salary = 30000.0;
        this.designation = "Junior";
     }

     public void calculateTax() {
        double tax = 0;
        if (salary > 50000.0) {
            tax = 0.30 * salary;
            System.out.println(name + " Tax Amount: " + tax + " Tk");
        } else if (salary > 30000.0) {
            tax = 0.10 * salary;
            System.out.println(name + " Tax Amount: " + tax + " Tk");
        } else {
            System.out.println("No need to pay tax");
        }
    }

     public void promoteEmployee(String newdesignation){
        if(newdesignation.equals("senior")){
            this.salary += 25000.0;
            System.out.println(name+ " has been promoted to "+ designation);
            System.out.println("New salary: "+this.salary);
        }
        if(newdesignation.equals("lead")){
            this.salary += 50000.0;
            System.out.println(name+ " has been promoted to "+ designation);
            System.out.println("New salary: "+this.salary);
        }
        if(newdesignation.equals("Manager")){
            this.salary += 75000.0;
            System.out.println(name+ " has been promoted to "+ designation);
            System.out.println("New salary: "+this.salary);
        }
     }

     public void displayInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
        System.out.println("Designation: "+designation);
     }
}
