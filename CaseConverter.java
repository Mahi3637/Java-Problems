import java.util.Scanner;
public class CaseConverter {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the String: ");
        String s1 = sc.nextLine();
        String result = "";

        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
          
                result += (char)(ch - 32);
            }
             else if(ch >= 'A' && ch <= 'Z') {
          
                result += (char)(ch + 32);
            } 
            else {
  
                result += ch;
            }
     }
        System.out.println("Converted String: " + result);
        sc.close();
  }
}