public class Borrower {
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Father Panchali", "Durgesh Nandini", "Anandmath"};
    
    private String name;
    private String[] borrowedBooks;
    private int booksBorrowedCount;
    
    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new String[3]; // Maximum 3 books per borrower
        this.booksBorrowedCount = 0;
    }
    
    public void borrowBook(String bookTitle) {
        // Find the index of the book
        int bookIndex = -1;
        for (int i = 0; i < book_name.length; i++) {
            if (book_name[i].equals(bookTitle)) {
                bookIndex = i;
                break;
            }
        }
        
        if (bookIndex == -1) {
            System.out.println("This book is not available.");
            return;
        }
        
        if (book_count[bookIndex] > 0) {
            if (booksBorrowedCount < 3) {
                borrowedBooks[booksBorrowedCount] = bookTitle;
                booksBorrowedCount++;
                book_count[bookIndex]--;
                System.out.println(bookTitle + " borrowed successfully by " + name);
            } else {
                System.out.println(name + " cannot borrow more than 3 books.");
            }
        } else {
            System.out.println("This book is not available.");
        }
    }
    
    public void borrowerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Books Borrowed:");
        for (int i = 0; i < booksBorrowedCount; i++) {
            System.out.println(borrowedBooks[i]);
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
    
    public static void bookStatus() {
        System.out.println("Available Books:");
        for (int i = 0; i < book_name.length; i++) {
            System.out.println(book_name[i] + ": " + book_count[i]);
        }
    }
}