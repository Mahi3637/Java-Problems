import java.util.Scanner;

public class SelectionSortDescending {
    public static void main(String [] args){
    
            Scanner scanner = new Scanner(System.in);
            
            
            System.out.print("N = ");
            int N = scanner.nextInt();
            
           
            int[] arr = new int[N];
            
            
            for (int i = 0; i < N; i++) {
                System.out.print("Enter a number: ");
                arr[i] = scanner.nextInt();
            }
            
            
            System.out.print("Original Array: ");

            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            
          
            for (int i = 0; i < N - 1; i++) {
            
                int maxIndex = i;
                for (int j = i + 1; j < N; j++) {
                    if (arr[j] < arr[maxIndex]) {
                        maxIndex = j;
                    }
                }
                
            
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
            
          
            System.out.print("Sorted Array: ");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            
            scanner.close();
        }
}
