public class ShelfTester{
    public static void main(String [] args){
      Shelf shelf = new Shelf();
      shelf.showDetails();
      System.out.println("1---------------");
      shelf.addBook(3);
      System.out.println("2---------------");
      shelf.capacity = 7;
      shelf.addBook(3);
      System.out.println("3---------------");
      shelf.showDetails();
      System.out.println("4---------------");
      shelf.addBook(5);
      shelf.showDetails();
      shelf.capacity += 4;
      System.out.println("6---------------");
      shelf.addBook(5);
      shelf.showDetails();
    }
  }
  
  