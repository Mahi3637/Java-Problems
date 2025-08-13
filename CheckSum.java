import java.util.Scanner;
public class CheckSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the n: ");
        int n = sc.nextInt();
        int lastTwo = 0;
        int sum = 0;
        while(n>9){
        lastTwo = n % 100;
        sum = (lastTwo/10) + (lastTwo%10);

        if(sum>9){
            sum = sum%10;
        }
        n = n/100;
        n = n * 10 + sum;
        }

        System.out.println("The Checksum is : "+ n);
    }
}
