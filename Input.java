import java.util.Scanner;
public class Input {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of the times: ");
        int num = sc.nextInt();

        System.out.println(" ");

        for(int i =0; i<30; i++){
            if(i % 5 == 0 && i % 3 != 0){
            System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }

        System.out.println();
    }
}
