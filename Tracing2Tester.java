public class Tracing2Tester {
    public static void main(String [] args){
       Tracing2 t1 = new Tracing2();
        t1.methodA(5);
        t1.methodA(3);
        Tracing2 t2 = new Tracing2();
        t2.methodA(4);
    }
 
}
