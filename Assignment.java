public class Assignment {
    public int tasks;          
    public String difficulty;
    public boolean submission;

   
    public Assignment() {
        
    }


    public Assignment(int tasks, String difficulty, boolean submission) {
        this.tasks = tasks;
        this.difficulty = difficulty;
        this.submission = submission;
    }

    public String makeOptional() {
        if (submission) {
            submission = false;
            return "Assignment will not require Submission";
        }
        return "Submission is already not required";
    }

    public void printDetails() {
        System.out.println("Number of tasks: " + tasks);
        System.out.println("Difficulty level: " + difficulty);
        System.out.println("Submission required: " + submission);
    }
}