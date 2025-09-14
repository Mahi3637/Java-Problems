import java.util.Scanner;
public class ArrayHw1 {
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
            int count = 0;
            for(int i = 0; i<arr.length; i++){
                if(arr[i] > 0){
                   int temp = 1;
                   arr[i] = temp;
                   count++;
                }
                if(arr[i] < 0){
                    int temp2 = 0;
                    arr[i] = temp2;
                    count++;
                }
                }

                System.out.print("Modified Array: ");  
                for (int i = 0; i < N; i++) {
                    System.out.print(arr[i] + " ");
                }        
        }

    }

    
            