import java.util.Scanner;
public class CSE110Ass4Task3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
      
        while (true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            
            // Stop if number is odd
            if (num % 2 == 1) break;
            
            // Skip if number is not positive
            if (num <= 0) continue;
            
            // Count divisors
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) count++;
            }
            
            System.out.println(num + " has " + count + " divisors");
        }  
    }  
    }

