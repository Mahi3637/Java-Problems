public class Company {
    private String name;
    private Employee[] employee;
    private int totalEmployee;
    private int employeeCount;
    private String fullTime;
    private String partTime;

    public Company(){
        this.name = "ABC";
        this.employee = new Employee [0];
        this.totalEmployee = 0;
        this.partTime = "";
        this.fullTime = "";
    }

    public void addEmployee(Employee newEmployee){
        if (employeeCount < employee.length) {
            employee[employeeCount] = newEmployee;
            employeeCount++;
            if (!newEmployee.equals("Unknown")) {
                System.out.println(newEmployee + " has joined the company");
            }
        } 
          else {
            System.out.println("No more vacancy");
        }

}

    public void removeEmployee(Employee newEmployee){
        for(int i = 0; i<employeeCount; i++){
            if(employee[i].equals(newEmployee)){
                employee[i] = null; 
                System.out.println(newEmployee + " has been removed from the company");
                break;
            }
        }

        for (int j = 0; j < employeeCount - 1; j++) {
            employee [employeeCount - 1] = null;
        employeeCount--;
        break;
    }

}

public void details() {
    System.out.println("Company Name: " + name);
    System.out.println("Total Employee: " + employeeCount);
    
    System.out.println("Fulltime Employees:");
    for (int i = 0; i < employeeCount; i++) {
        if (employee[i] != null && employee[i].getType().equals("Fulltime")) {
            System.out.println("Name: " + employee[i].getName() + ", ID: " + employee[i].getId());
        }
    }
    
    System.out.println("Part-Time Employees:");
    for (int i = 0; i < employeeCount; i++) {
        if (employee[i] != null && employee[i].getType().equals("Part-time")) {
            System.out.println("Name: " + employee[i].getName() + ", ID: " + employee[i].getId());
        }
    }
}


}
