package users;
import books.Book;
import java.util.ArrayList;
import java.util.List;

public class User {
	private int id;
    private String name;
    private List<Book> borrowedBooks;  // Lista me ta vivlia pou exei danistei o user
    // constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // add book to the list with the borrowed books
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(this.name + " borrowed the book: " + book.getTitle());
    }

    // Delete books from the list with the borrowed books
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(this.name + " returned the book: " + book.getTitle());
    }
}

/* PROSOXI!!!!!!!
 * Autos o tropos pou exw ftiaxei den einai o swstos. Oi danismoi twn vivliwn den prepei na ginontai ston user 
 * kai na kalountai mesa ston user alla prepei na apothikeyontai se xehoristi klasi pinaka kai o user na xrisimopoieitai san attribute
 */






