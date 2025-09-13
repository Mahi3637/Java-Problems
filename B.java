// public class B extends A {
//   public int x;
//   public B(){
//     y = temp + 3 ;
//     sum = 3 + temp + 2;
//     temp-=1;
//   } 
//   public B(B b){
//     sum = b.sum;
//     x = b.x;
//   }
//   public void methodB(int m, int n){    
//    int  y = 0;
//    y = y + this.y;
//    x = this.y + 2 + temp;
//    methodA(x, y);
//    sum = x + y + super.sum;
//    System.out.println(x + " " + y+ " " + sum);
//   }
// }
  
// class B extends A {
//   public static int x = 1;
//   public B(){
//       y = temp + 1 ;
//       x = 3 + temp + x;
//       temp-=2;
//   }  
//   public B(B b){
//       sum = b.sum + super.sum;
//       x = b.x + x;
//   }
//   public void methodB(int m, int n){    
//      int [] y = {0};
//       super.y = y[0] + this.y + m; 
//       x = super.y + 2 + temp - n;
//       methodA(x, y);
//       sum = x + y[0] + super.sum;
//       System.out.println(x + " " + y[0]+ " " + sum);
//   }
// }





public class B extends A {
  public static int x = 0;
  public int sum = -6;
  public B() {
    sum = 0;
    y = temp + 3;
    super.sum = 3 + temp + 2;
    temp -= 2;
  }
  public B(B b) {
    sum = b.sum + super.sum;
    x = b.x;
    b.methodB(2, 3);
  }
  public void methodB(int m, int n) {
    int y = 0;
    y = y + this.y;
    x = y + 2 + (++temp);
    methodA(x, y);
    sum = x + y + sum;
    System.out.println(x + " " + y + " " + sum);
  }
}

