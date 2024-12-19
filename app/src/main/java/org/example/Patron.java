public class Patron {
    private String name;
    private String patronId;
   
    // Constructor
    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPatronId() {
        return patronId;
    }
    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }
   
    // Method to borrow a book
    public void borrowBook(Library library, String isbn) {
        Book book = library.findBookByIsbn(isbn);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else if (book == null) {
            System.out.println("The book with ISBN " + isbn + " was not found.");
        } else {
            System.out.println("Sorry, the book '" + book.getTitle() + "' is currently unavailable.");
        }
    }
   
    // Method to return a book
    public void returnBook(Library library, String isbn) {
        Book book = library.findBookByIsbn(isbn);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println(name + " returned the book: " + book.getTitle());
        } else if (book == null) {
            System.out.println("The book with ISBN " + isbn + " was not found.");
        } else {
            System.out.println("This book was not borrowed.");
        }
    }
}