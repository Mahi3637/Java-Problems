import java.util.Scanner;
public class largest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number 1:");
    int num1 = sc.nextInt();
    System.out.println("Enter the number 2 :");
    int num2 = sc.nextInt();
    System.out.println("Enter the number 3:");
    int num3 = sc.nextInt();
    System.out.println("  ");
    if(num1>num2 && num1>num3){
        System.out.println("Number 1 is the highest");
    }
    else if(num2>num1 && num2> num3){
        System.out.println("Number 2 is ther highest");
    }
    else if(num3>num1 && num3>num2){
        System.out.println("Number 3 is the Highest");
    }
    else{
        System.out.println("%%%%%%%%%%%%%%%%%%");
    }
}
}
