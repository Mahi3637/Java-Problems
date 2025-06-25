import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word for the palindromic check:");
        String s1 = sc.nextLine();
     String rev = "";
     for(int i = s1.length() - 1; i >= 0; i--) {
         rev = rev + s1.charAt(i);
     }
     
     if(rev == s1) {
         System.out.println("The word is a palindrome.");
     } 
        else {
         System.out.println("The word is not a palindrome.");
     }
}
}
