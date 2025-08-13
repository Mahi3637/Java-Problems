import java.util.Scanner;

public class Testcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int N = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            int sum = 0;
            int current = X;
            int count = 0;
            
            // Find Y odd numbers starting from X
            while (count < Y) {
                // Check if current number is odd
                if (current % 2 != 0) {
                    sum += current;
                    count++;
                }
                current++;
            }
            
            System.out.println(sum);
        }
        
        scanner.close();
    }
}