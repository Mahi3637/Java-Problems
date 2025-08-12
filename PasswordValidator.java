import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        
        boolean nameFound = false;
        

        for (int i = 0; i <= password.length() - name.length(); i++) {
            boolean match = true;
            
            for (int j = 0; j < name.length(); j++) {

                if (password.charAt(i + j) != name.charAt(j)) {
                    match = false;
                    break;
                }
            }
            
            if (match) {
                nameFound = true;
                break;
            }
        }
        
        if (nameFound) {
            System.out.println("Invalid");
        }
          else {
            System.out.println("Valid");
        }
    }
}

