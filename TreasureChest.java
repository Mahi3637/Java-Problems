import java.util.Scanner;

public class TreasureChest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String input = scanner.nextLine();
        
        int vowels = 0;
        int consonants = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

                char lowerC = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
                
                if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || 
                    lowerC == 'o' || lowerC == 'u') {
                    vowels++;
                } 
                   else {
                    consonants++;
                }
            }
        }
        
        if (vowels > 0 && consonants > 0 && vowels % 3 == 0 && consonants % 5 == 0) {
            System.out.println("Aaarr! Me Plunder!!");
        }
          else {
            System.out.println("Blimey! No Plunder!!");
        }
    }
}

