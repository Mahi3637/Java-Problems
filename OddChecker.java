import java.util.Scanner;
public class OddChecker {
    public static void main(String []args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the required number: ");
    int num = sc.nextInt();
    System.out.println(" ");
   
        if(num%2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    
    }
}
