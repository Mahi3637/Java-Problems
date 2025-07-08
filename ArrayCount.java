import java.util.Scanner;
import java.util.Arrays;
public class ArrayCount{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length of the array: ");
    int length = sc.nextInt();
    
    System.out.println(" ");

    int [] arr = new int [length];
    int count = 1;
    int current = arr[0];

    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();

        if (arr[i] == current) {
            count++;
    }

    else {
        System.out.println(current + " - " + count + " times");
        current = arr[i];
        count = 1;
    }

    }

    System.out.println(current + " - " + count + " times");
  }
}