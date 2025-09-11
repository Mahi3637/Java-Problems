import java.util.Scanner;
public class Recursion2 {
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the value of the N : ");
        int N = sc.nextInt();

        System.out.print("Output: "+ " ");

        nToOne(N, 1);
    }

    public static void nToOne(int current, int n) {
        if (n < current) {
            return;
        }
        System.out.print(n + " ");
        nToOne(current, n - 1);

    }
}

