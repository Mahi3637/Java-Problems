import java.util.Scanner;
public class KarimShopping {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the salary of Karim mia: ");
        double salary = sc.nextDouble();

        double totalSalary = salary + (salary*0.75);

        double wifeBudget = 0.45 * totalSalary;
        double sonBudget = 0.45 * totalSalary;
        double emergency = 0.10 * totalSalary;

        double laptopCost = 90000;
        double ps5Cost = 70000 + 7000; // PS5 + extra controller and games
        
        System.out.printf("Amount with Bonus: %.2f\n", totalSalary);
        System.out.printf("Wife Budget: %.2f\n", wifeBudget);
        System.out.printf("Son Budget: %.2f\n", sonBudget);
        System.out.printf("Savings: %.2f\n", emergency);

        boolean wifeCanBuy = wifeBudget >= laptopCost;
        boolean sonCanBuy = sonBudget >= ps5Cost;

        if(wifeCanBuy && sonCanBuy){
            System.out.println("Wife happy");
            System.out.println("Son happy");
        }
      else if(!wifeCanBuy && sonCanBuy){
          
      }
    }
}
