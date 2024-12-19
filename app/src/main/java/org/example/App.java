/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();
       
        // Create books
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "2345678901");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "3456789012");
       
        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
       
        // Create a patron
        Patron patron = new Patron("John Doe", "P001");
       
        // View available books
        System.out.println("Books available in the library:");
        library.viewBooks();
        
        // Patron borrows a book by ISBN
        patron.borrowBook(library, "1234567890"); // Book with ISBN 1234567890 (1984) is available, will be borrowed
      
        // View available books again
        System.out.println("\nBooks available after borrowing a book:");
        library.viewBooks();
      
        // Patron tries to borrow the same book again
        patron.borrowBook(library, "1234567890"); // Book with ISBN 1234567890 is now unavailable
      
        // Patron returns a book by ISBN
        patron.returnBook(library, "1234567890"); // Book with ISBN 1234567890 will be returned
       
        // View available books again
        System.out.println("\nBooks available after returning a book:");
        library.viewBooks();
    }
}

