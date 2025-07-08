import java.util.Scanner;
public class PrimeCount {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();
        int count = 0;
        boolean isPrime;

        for(int i=num1; i<=num2; i++){
            isPrime = true;
            if(i <= 1) {
                isPrime = false;
            } 
            else {
                for(int j=2; j<=Math.sqrt(i); j++){
                    if(i%j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println("There are "+" "+count+" "+"primes");
    }
}