public class Cart {
    public String[] items;
    public double[] prices;
    public int cartNumber;
    public int itemCount;
    public int maxItem = 3;
    public double discount = 0.0;

    public void create_cart(int num) {
        this.cartNumber = num;
        this.items = new String[maxItem];
        this.prices = new double[maxItem];
        this.itemCount = 0;
    }

    public void addItem(String name, double price) {
        if (itemCount >= maxItem) {
            System.out.println("You already have 3 items on your cart");
            return;
        }
        else{
        items[itemCount] = name;
        prices[itemCount] = price;
        itemCount++;
        System.out.println(name + " added to cart " + cartNumber + ".");
        System.out.println("You have " + itemCount + " item(s) in your cart now.");
    }
}

    public void addItem(double price, String name) {
        if (itemCount >= maxItem) {
            System.out.println("You already have 3 items on your cart");
            return;
        }
        else{
        items[itemCount] = name;
        prices[itemCount] = price;
        itemCount++;
        System.out.println(name + " added to cart " + cartNumber + ".");
        System.out.println("You have " + itemCount + " item(s) in your cart now.");
    }
}

    public void cartDetails() {
        System.out.println("Your cart(c" + cartNumber + ") :");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i] + " - " + prices[i]);
        }
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Total price: " + calculateTotal());
    }

    public void giveDiscount(double discount) {
        this.discount = discount;
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }
        return total * (1 - discount / 100);
    }
}