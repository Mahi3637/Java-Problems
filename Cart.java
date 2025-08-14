public class Cart{
    public String Item;
    public double [] Prices;
    public String [] Items;
    public int ItemCount;
    public int TotalItems;
    public int CartNumber;
    public int MaxItem = 3;
    public double ItemPrice;
    public int discount;

    public void create_cart(int num){
    this.CartNumber = num;
    this.Prices = new double [MaxItem];
    this.Items = new String [MaxItem];
    this.ItemCount = 0;
    }

    public void addItem(String Item, double ItemPrice){
    this.Item = Item;
    this.ItemPrice = ItemPrice;
    if(ItemCount >= MaxItem){
        System.out.println("No more items can be added as the limit has been reached");
        return;
    }
    else{
        Prices [ItemCount] = ItemPrice;
        Items [ItemCount] = Item;
        ItemCount++;
        System.out.println(Item+ " added to cart " + CartNumber + ".");
        System.out.println("You have " + ItemCount + " item(s) in your cart now.");

    }
    }

    public void addItem(double ItemPrice, String Item){
        this.Item = Item;
        this.ItemPrice = ItemPrice;
        if(ItemCount >= MaxItem){
            System.out.println("No more items can be added as the limit has been reached");
            return;
        }
        else{
            Prices [ItemCount] = ItemPrice;
            Items [ItemCount] = Item;
            ItemCount++;
            System.out.println(Item+ " added to cart " + CartNumber + ".");
            System.out.println("You have " + ItemCount + " item(s) in your cart now.");
    
        }
     }

     public void giveDiscount(int discountAmount){
        this.discount = discountAmount;
     }

    public double calculateTotal(){
     double TotalPrice = 0;
     for(int i = 0; i<ItemCount; i++){
        TotalPrice += Prices[i];
     }
      TotalPrice = TotalPrice * (1 - discount / 100);
      return TotalPrice;
    }

     public void cartDetails() {
        System.out.println("Your cart(c" + CartNumber + ") :");
        for (int i = 0; i < ItemCount; i++) {
            System.out.println(Items[i] + " - " + Prices[i]);
        }
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Total price: " + calculateTotal());
    }

}