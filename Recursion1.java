import java.util.Scanner;

public class Recursion1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the N: ");
        int N = sc.nextInt();

        System.out.println("Output: " + "");

        OneToN(1, N);
    }

    public static void OneToN(int current, int N){
      if(current > N){
        return;
      }

      System.out.print(current+ " ");
      OneToN(current+1, N);
    }
}