class Student2 {
  public int id;
    public double cgpa;
    public String[] courses;
    public int courseCount;

    public Student2(int id) {
        this.id = id;
        this.cgpa = 0.0;
        this.courses = new String[4];
        this.courseCount = 0;
        System.out.println("A student with ID " + id + " has been created.");
    }

    public Student2(int id, double cgpa) {
        this.id = id;
        this.cgpa = cgpa;
        this.courses = new String[4];
        this.courseCount = 0;
        System.out.println("A student with ID " + id + " and cgpa " + cgpa + " has been created.");
    }

    public void storeCG(double cgpa) {
        this.cgpa = cgpa;
    }

    public void storeID(int id) {
        this.id = id;
    }

    public void addCourse(String course) {
        if (this.cgpa == 0.0) {
            System.out.println("Failed to add " + course);
            System.out.println("Set CG first");
            return;
        }

        if (this.courseCount >= 4 || (this.cgpa < 3 && this.courseCount >= 3)) {
            System.out.println("Failed to add " + course);
            if (this.cgpa < 3 && this.courseCount >= 3) {
                System.out.println("CG is low. Can't add more than 3 courses.");
            }
             else {
                System.out.println("Maximum 4 courses allowed.");
            }
            return;
        }

        this.courses[this.courseCount++] = course;
    }

    public void addCourse(String[] courses) {
        for (String course : courses) {
            this.addCourse(course);
        }
    }

    public void removeAllCourse() {
        this.courses = new String[4];
        this.courseCount = 0;
    }

    public void showAdvise() {
        System.out.println("Student ID: " + this.id + ", CGPA: " + this.cgpa);
        if (this.courseCount == 0) {
            System.out.println("No courses added.");
        } else {
            System.out.println("Added courses are:");
            for (int i = 0; i < this.courseCount; i++) {
                System.out.print(this.courses[i] + " ");
            }
            
            System.out.println();
            System.out.println();
        }
    }
}