import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        
        boolean hasLength = password.length() >= 8;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            
            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            } 
             else if (c >= 'a' && c <= 'z') {
                hasLower = true;
            } 
               else if (c >= '0' && c <= '9') {
                hasDigit = true;
            }
                    else if (c != ' ') { 

                hasSpecial = true;
            }
        }
        
        if (hasLength && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("True");
        }
             else {
            System.out.println("False");
        }
    }

}

 
    

