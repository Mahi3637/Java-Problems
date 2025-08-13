import java.util.Scanner;
public class MidFall24Solve {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the n: ");
        int n = sc.nextInt();

        double y = 0; 
     
        for(int i = 1; i<=n; i++){
            if(i % 4 == 0){
                y -= 1/i;
            }

            else{
                y += 1/i;
            }
        }
        System.out.println("the value of the y is: "+y);
    }
}
