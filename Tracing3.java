// public class Tracing3{
//     public static void main(String args[]){
//       int x = 0, y = 0;
//       int sum = 0;
//       while (x < 4){
//           y = x - 3;
//           while (y < 3){ 
//           sum = (sum % 3) + x - y * 3 ;
//           System.out.println(sum);
//           y = y + 1;
//           }
//           if (x > 5){
//           x++;
//           }
//         else{
//           x += 2;
//           }
//       }
//     }
//  }
 

// public class Tracing3{ 
//     public static void main(String[] args) {
//         int sum = 0, r = 0, i = 10, j = -5000;
//         while (i < 10000) {
//             r = (i%2) + 1;
//             j = i + 2;
//             while (j < i){
//                 r = 2-4+6-8+10-12;
//                 j++;
//             }
//             sum = i % r + (i * r) - j + 5;
//             System.out.println(sum);
//             j--;
//             if (i > 18) {
//                 sum += (++r) + i/3 + r + 12;
//                 break;
//             }
//             else{
//                 i += 3;
//             }
//         }
//         System.out.println(sum);
//     }
//  }
 
 
public class Tracing3
 {
    public static void main(String args[]) {
      int x = 0, i = 0, sum = 0;
      i = 1;
      x = 2;
      sum = 0;
      while (i < 20){
           x = x + i;
           sum = sum + x + 1;
           System.out.println(sum);
           if (x > 5){
               i += 2;
          }
           else {
               i += 3;
          }
      }
      sum = sum + i;
      System.out.println(sum);
    }
  }
  
  