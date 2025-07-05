public class Assignment {
    public int task;
    public String difficulty;
    public boolean submission;

    public Assignment(int task, String difficulty, boolean submission){
        this.task = 0;
        this.difficulty = "null";
        this.submission = false;
    }

        public void makeOptional(){
           System.out.println("Assignment will not require the submission"); 
           return;
            
        }
        public void printDetails(){
        System.out.println("Numebr of the task: "+task);
        System.out.println("Difficulty level: "+difficulty);
        System.out.println("Submission Required: "+ submission);
        }
    }

