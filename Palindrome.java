import java.util.Scanner;
public class Palindrome {
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String for the palindromic check:");
       String s1 = sc.nextLine();
       System.out.println(" ");
       String rev = "";
       boolean isPalindrome = true;
       for(int i = s1.length()-1; i<0; i--){
        rev += s1;
        isPalindrome = true;
       }
       System.out.println(rev);
       if(isPalindrome){
        System.out.println("Palindrome");
       }
       else{
        System.out.println("Not Palindrome");
       }
    }
}
