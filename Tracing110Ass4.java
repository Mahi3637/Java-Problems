// public class Tracing110Ass4{ 
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
 

public class Tracing110Ass4
{ 
  public static void main(String args[])
  {
	int x = 0, y = 0;
	int sum = 0;
	while (x < 10){
  	  y = x - 3;
  	  y = 40;
  	  while (y > 22){
    	    if ((sum > 30) && (sum < 40)){
      	  sum = sum + x * 2 ;
         }
    	    else if ((sum > 40) && (sum < 50)){
      	  sum = sum + x * 3;
         }
    	    else {
      	  sum = sum + 23;
         }
    	    System.out.println(sum);
    	    y = y - 10;
  	  }
  	  x += 2;
	}
  }
}

