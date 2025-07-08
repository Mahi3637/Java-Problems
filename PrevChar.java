import java.util.Scanner;

public class PrevChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string in lowercase letters: ");
        String input = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch== 'a') {
                result.append('z');
            } 
            else if (ch >= 'b' && ch <= 'z') {
                result.append((char)(ch - 1));
            } 
            
            else {
    
                result.append(ch);
            }
        }
        
        System.out.println("Output: " + result.toString());
    }
}