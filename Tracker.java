public class Tracker {
    public String name;
    public double balance;
    public double income;
    public double expense;

    public Tracker(String name, double balance){
        this.name = "Null";
        this.balance = 0;
    }

    public void createTracker(String name){
        this.name = name;
        balance = 1.0;
}

public void income(double income){
    this.income += balance;
 }

public void expense(double expense){
    this.expense =expense;
    if(expense > balance){
        System.out.println("You are broke");
    }
    else if(balance == 0){
        System.out.println("Balance is 0");
    }
    else{
        balance = income - expense;
    System.out.println("balance has been updated");
    }
    
  }

  public void showHistory(){
     System.out.println("Last Added: "+ income);
     System.out.println("Last Spent: "+balance);
  }

  public void info(){
     System.out.println("Name: "+name);
     System.out.println("Balance: "+balance);
     return;
  }
}

