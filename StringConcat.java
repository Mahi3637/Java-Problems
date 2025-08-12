import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        String result = "";
        

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            boolean found = false;
            
            for (int j = 0; j < str2.length(); j++) {
                if (c == str2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                result += c;
            }
        }
        

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            boolean found = false;
            
            for (int j = 0; j < str1.length(); j++) {
                if (c == str1.charAt(j)) {
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                result += c;
            }
        }
        

        String upperResult = "";
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            if (c >= 'a' && c <= 'z') {
                upperResult += (char)(c - 32);
            } else {
                upperResult += c;
            }
        }
        
        System.out.println(upperResult);
    }
}