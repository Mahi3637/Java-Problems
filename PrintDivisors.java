import java.util.Scanner;
public class PrintDivisors {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in); 

        while(true){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if(num % 2 != 0){
                break;
            }

            int count = 0;

            for(int i = 1; i<num; i++){
                if(num % i == 0){
                    count++;
                }
            }

            System.out.println(num + " has " + count + " divisors");
        }
    }
}
 