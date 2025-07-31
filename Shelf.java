public class Shelf{
    public int capacity;
    public int addBook;

    public Shelf(){
        this.capacity = 0;
        this.addBook = 0;
    }

    public void Capacity(int capacity){
        this.capacity = capacity;
    }

    public void addBook(int newBook){
        if(capacity == 0){
            System.out.println("Zero Capacity and cannot add the books");
        }

        if(addBook + newBook > capacity){
            System.out.println("Exceeds the Capacity");
        }

     else{
        addBook += newBook;
        System.out.println(addBook+" books added to the Shelf");
     }
    }

    public void showDetails() {
        System.out.println("Shelf capacity: " + capacity);
        System.out.println("Number of books: " + addBook);
    }
}