public class TrackerTester {
    public static void main(String[] args) {
        Tracker tr1 = new Tracker("null", 0);
        tr1.info();
        tr1.createTracker("John");
        System.out.println("1 ==========");
        tr1.info();
        System.out.println("2 ==========");
        tr1.income(1000);
        tr1.info();
        System.out.println("3 ==========");
        tr1.expense(800);
        tr1.expense(100);
        tr1.info();
        System.out.println("4 ==========");
        tr1.showHistory();
        System.out.println("5 ==========");
        tr1.expense(101);
        System.out.println("6 ==========");
        tr1.expense(200);
        System.out.println("7 ==========");
        tr1.income(200);
        tr1.showHistory();
        System.out.println("8 ==========");
    }
 
}
