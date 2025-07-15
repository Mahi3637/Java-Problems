public class Student {
    public String name = "not set";
    public String department = "CSE";
    public double cgpa = 0;
    public int credit = 9;
    public boolean scholarshipStatus = false;

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

        public String checkScholarshipEligibility() {
            if (cgpa >= 3.5 && credit > 10) {
                if (cgpa >= 3.5 && cgpa < 3.7) {
                    return name + " is eligible for need based Scholarship";
                }
                else if (cgpa >= 3.7) {
                    return name + " is eligible for Merit based Scholarship";
                }
            }
            return name + " is not eligible for any scholarship";
        }
        
        public void showDetails() {
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.println("CGPA: " + cgpa);
            System.out.println("Credit: " + credit);
            System.out.println("Scholarship Status: " + checkScholarshipEligibility()); // Now works!
        }
    }

