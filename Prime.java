import java.util.Scanner;
public class Prime {
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the required numbwr :");
     int num = sc.nextInt();
     System.err.println(" ");
     boolean isPrime = true;
     for(int i=2; i<num; i++){
        if(num % i ==0){
        isPrime = false;
        }
        break;
     }
     if(isPrime){
        System.out.println("The number is a prime Number");
     }
     else{
        System.out.println("Not a prime Number");
     }
    }
}
