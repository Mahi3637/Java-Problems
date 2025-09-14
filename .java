public class Library{
    public String bookName;
    public String [] books;
    public int bookCount;
    public int BookCapacity;

    public Library(){
        this.books = new String [0];
      this.bookCount = 0;
    }

    public void setBookCapacity(int capacity) {
        this.BookCapacity = capacity;
        this.books = new String[capacity];
    }


    public void addBook(String bookName){
        if(bookCount >= BookCapacity){
            System.out.println("Cannot add more books to the list");
        }
        else{
           books [bookCount] = bookName;
           bookCount++;
           System.out.println(bookName+" added to the Library");
        }
    }

    public void printDetail(){
          System.out.println("Maximum capacity: "+BookCapacity);
          System.out.println("Total Books: "+ bookCount);
          System.out.println("Books :");
          for(int i = 0; i<bookCount; i++){
            System.out.println(books[i]);
}

    }

}