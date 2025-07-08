import java.util.Scanner;

public class ArrayRev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        

        int[] arr = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            

            left++;
            right--;
        }
        

        System.out.println("Reversed array:");
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}