import java.util.Scanner;
public class CSE110Ass3task1 {
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number: ");
      int N = sc.nextInt();

      int count = 0;
      int num = 2;

      while(count < N){
        boolean isPrime = true;

        for(int i =2; i<=num/2; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num);
            count++;
        }
        num++;
      }
    }
}
