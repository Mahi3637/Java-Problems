public class BracuBus {
    private String route;
    private int maxCapacity;
    private BracuStudent[] passengers;
    private int passengerCount;
    
    public BracuBus(String route) {
        this(route, 2); // default capacity is 2
    }
    
    public BracuBus(String route, int maxCapacity) {
        this.route = route;
        this.maxCapacity = maxCapacity;
        this.passengers = new BracuStudent[maxCapacity];
        this.passengerCount = 0;
    }
    
    public void board() {
        if (passengerCount == 0) {
            System.out.println("No passengers");
        }
    }
    
    public void board(BracuStudent student) {
        if (passengerCount >= maxCapacity) {
            System.out.println("Bus is full!");
            return;
        }
        
        if (!student.hasPass()) {
            System.out.println("You don't have a bus pass!");
            return;
        }
        
        if (!student.getLocation().equals(this.route)) {
            System.out.println("You got on the wrong bus!");
            return;
        }
        
        passengers[passengerCount] = student;
        passengerCount++;
        System.out.println(student.getName() + " boarded the bus.");
    }
    
    public void board(BracuStudent... students) {
        for (BracuStudent student : students) {
            board(student);
        }
    }
    
    public void showDetails() {
        System.out.println("Bus Route: " + route);
        System.out.println("Passenger Count: (" + passengerCount + ") (Max: " + maxCapacity + ")");
        System.out.println("Passengers on Board:");
        
        if (passengerCount == 0) {
            System.out.println();
            return;
        }
        
        for (int i = 0; i < passengerCount; i++) {
            System.out.print(passengers[i].getName());
            if (i < passengerCount - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
