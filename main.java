import java.util.Scanner;

public class main{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the required number:");
    int num = scanner.nextInt();
    System.out.println("   ");
    if(num%2==0){
    System.out.println("The number is an even number");
    }
    else{
      System.out.println("ODD");;
    }
  }
}