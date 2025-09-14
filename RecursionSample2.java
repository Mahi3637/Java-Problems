public class RecursionSample2 {
    public static void main(String[] args) {
        mystery(5);
    }
    
    public static void mystery(int n) {
        if (n > 0) {
            mystery(n - 2);
            System.out.print(transform(n) + " ");
            mystery(n - 1);
        }
    }
    
    public static int transform(int x) {
        int y = x--;
        return (y * 2) + x;
    }
}
