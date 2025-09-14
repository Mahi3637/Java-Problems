import java.util.Scanner;

public class BubbleSortAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take array input from user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Print original array
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Bubble Sort Algorithm (Ascending Order)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // Print sorted array
        System.out.print("Sorted Array (Ascending): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}