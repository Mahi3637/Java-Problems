import java.util.Scanner;

public class Rectangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read length and width
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        
        // Create the rectangle pattern
        for (int i = 0; i < width; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print(j);
                if (j < length) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}