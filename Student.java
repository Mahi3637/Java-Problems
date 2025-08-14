public class Student{
    public String name;
    public String department;
    public double cgpa;
    public int credit;
    public String scholarshipStatus;

    public Student(){
        this.name = "not set";
        this.department = "CSE";
        this.cgpa = 0.0;
        this.credit = 0;
        this.scholarshipStatus = "Not set";
    }

    public void updateDetails(String name, double cgpa, int credit){
        this.name = name;
        this.cgpa = cgpa;
        this.credit = credit;
    }

  public void updateDetails(String name, double cgpa){
    this.name = name;
    this.cgpa = cgpa;
}

public void updateDetails(String name, double cgpa, int credit, String department){
    this.name = name;
    this.cgpa = cgpa;
    this.credit = credit;
    this.department = department;
  }

  public String checkScholarshipEligibility(){
    if(cgpa > 3.5 && credit > 10){
      return name + " is eligible for the scholarship";
    }
    else if(cgpa > 3.5 && cgpa < 3.7){
        return name + " is eligible for the need-based scholarship";
    }
    else if(cgpa > 3.7){
        return name + " is eligible for the merit-based scholarship";
    }
    else{
        return "No scholarship is applicable for " + name;
    }
  }

  public void showDetails(){
    System.out.println("Name: "+name);
    System.out.println("Department: "+department);
    System.out.println("CGPA: "+cgpa);
    System.out.println("Credit: "+credit);
    System.out.println("Scholarship Status: " + checkScholarshipEligibility());
  }
}