public class Library {
    private int bookCapacity;
    private String[] books;
    private int bookCount;
    
    public Library() {
        this.bookCount = 0;
    }
    
    public void setBookCapacity(int capacity) {
        this.bookCapacity = capacity;
        this.books = new String[capacity];
    }
    
    public void addBook(String bookName) {
        if (bookCount < bookCapacity) {
            books[bookCount] = bookName;
            bookCount++;
            System.out.println("Book '" + bookName + "' added to the library");
        } 
        else {
            System.out.println("Exceeds maximum capacity. You can't add more than " + bookCapacity + " books");
        }
    }
    
    public void printDetail() {
        System.out.println("Maximum Capacity: " + bookCapacity);
        System.out.println("Total Books: " + bookCount);
        System.out.println("Book list:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }
}