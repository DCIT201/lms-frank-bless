import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books;
  
    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }
   
    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }
   
    // Method to remove a book from the library
    public void removeBook(Book book) {
        books.remove(book);
    }
   
    // Method to view all books in the library
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
   
    // Method to find a book by ISBN
    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null; // Book not found
    }
}