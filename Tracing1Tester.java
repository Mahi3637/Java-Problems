public class Tracing1Tester {
    public static void main(String [] args){
        Tracing1  t1 = new Tracing1();
        t1.methodA(5);
        t1.methodA(3);
        Tracing1 t2 = new Tracing1();
        t2.methodA(4);
    }
 
}
