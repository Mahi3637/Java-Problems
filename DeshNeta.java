import java.util.Scanner;

public class DeshNeta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amount = sc.nextDouble();
        double deshnetar_amount = 0;

        if (amount > 0) {
            deshnetar_amount = amount * 0.10;  
            amount = amount - deshnetar_amount; 
        }

        System.out.println("Desh Netar amount is: " + deshnetar_amount);
        System.out.println("You are left with: " + amount);
    }
}