public class Borrower{
public static int book_count[] = {3, 3, 3};
public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
private String name;
private String[] borrowedBooks;
private int borrowedCount;
private String BookTitle;

public Borrower(String name){
this.name = name;
this.borrowedBooks = new String [3];
this.borrowedCount = 0;
}

public void borrowBook(String BookTitle){
    this.BookTitle = BookTitle;
    int index = -1;

    for(int i = 0; i<book_name.length; i++){
        if(book_name[i].equals(BookTitle)){
          index = i;
          break;
        }
    }

    if(index == -1){
        System.out.println("Sorry the book is not available");
    }

    if(book_count[index] > 0){
        book_count[index]--;
        borrowedBooks[borrowedCount] = BookTitle;
        borrowedCount++;
    }
    else {
        System.out.println("This book is not available.");
    }
}

   public void borrowerDetails(){
    System.out.println("Name: " + name);
    for(int i = 0; i<borrowedBooks.length; i++){
        System.out.println(borrowedBooks[i]);
    }
   }

   public static void bookStatus(){
    for(int i = 0; i<book_name.length; i++){
      System.out.println("Book Name: " + " :"+ book_count);
    }
   }

   public static int remainingBooks(String bookTitle) {
    for (int i = 0; i < book_name.length; i++) {
        if (book_name[i].equals(bookTitle)) {
            return book_count[i];
        }
    }
    return 0;
}
}
