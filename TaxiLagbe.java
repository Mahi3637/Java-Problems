public class TaxiLagbe {
    public String TaxiNo;
    public String area;
    public int TotalPassenger;
    public String [] PassengerList;
    public String name;
    public int Fare;
    public int Totalfare;
    public int MaxCapacity = 4;

    public TaxiLagbe(){
    this.TotalPassenger = 0;
    this.PassengerList = new String [MaxCapacity];
    this.Fare = 0;
    this.Totalfare = 0;
    }

    public void StoreInfo(String TaxiNo, String area){
    this. TaxiNo = TaxiNo;
    this.area = area;
    }

    public void addPassenger(String name, int Fare){
    this.name = name;
    this.Fare = Fare;

    if(TotalPassenger >= MaxCapacity){
    System.out.println("taxi is full....No more Passengers can be added");
      }
    else{
        PassengerList [TotalPassenger] = name;
        TotalPassenger++;
        Totalfare += Fare;
        System.out.println("Dear "+ name+" welcome to the taxi babyyy");
    }
    }

    public void addPassenger(String name1, int Fare1, String name2, int Fare2){
    addPassenger(name1, Fare1);
    addPassenger(name2, Fare2);
        
    }

    public void printDetails() {
        System.out.println("Taxi number: " + TaxiNo);
        System.out.println("This taxi can cover " + area + " area");
        System.out.println("Total Passenger: " + TotalPassenger);
        System.out.println("Passenger lists:");
        
        for (int i = 0; i < TotalPassenger; i++) {
            System.out.print(PassengerList[i]);
            if (i < TotalPassenger - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("Total collected fare: " + Totalfare + " Taka");
    }
}
