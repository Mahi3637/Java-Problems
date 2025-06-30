import java.util.Scanner;
public class Matrix {
    public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the row of the Matrix: ");
     int rows = sc.nextInt();
     System.out.println(" ");
     System.out.println("Enter the columns of the Matrix: ");
     int cols = sc.nextInt();
     System.out.println(" ");

     int [][] num = new int [rows][cols];

     for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            num [i][j] = sc.nextInt();
        }
     }

     for(int i=0; i<rows; i++){
        for( int j =0; j<cols; j++){
            System.out.print(num [i][j] + " ");
        }
        System.out.println(" ");
     }
}    
}
