import java.util.Scanner;

public class AlternatingCaps {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        
        String result = "";

        boolean makeLower = true; 
        
        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);
            
       
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

                if (makeLower) {

           
                    if (c >= 'A' && c <= 'Z') {

                        result += (char)(c + 32);

                    }
                        else {
                        result += c;

                    }

                }
                         else {
             
                    if (c >= 'a' && c <= 'z') {

                        result += (char)(c - 32);

                    }  
                      else {

                        result += c;
                    }
                }
                makeLower = !makeLower;
            }  
             else {
                result += c;
            }
        }
        
        System.out.println(result);
    }
}
