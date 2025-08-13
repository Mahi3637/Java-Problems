import java.util.Scanner;
public class SumAvg {
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);

      int sum = 0;
      int avg = 0;
      int count = 0;

      for(int i = 0; i<=10; i++){
        System.out.println("Enter  a number : ");
        int num = sc.nextInt();
        sum += num;
        count ++;
      }
        avg = sum / count;
        System.out.println("Sum is : " + sum);
        System.out.println("Average is : " + avg);
        sc.close();
    }
}
