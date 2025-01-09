package books;
import java.util.ArrayList;
import java.util.List;

import authors.Author;
import authors.AuthorServices;
import themes.Theme;
import themes.ThemeServices;


public class BookServices {
    
	AuthorServices authorServices; //upostiriktikh uphresia
	ThemeServices themeServices;  //xrhsimopoiei uposthriktiki upiresia
	
	// constructor arxikopoiei ta AuthorServices kai Themeservices wste na einai diathesima gia tis alles methodous
	public BookServices(AuthorServices a, ThemeServices b) {
		authorServices = a;
		themeServices = b;
	}
	
	// H lista books apothikeuei ola ta vivlia
	private List<Book> books = new ArrayList<Book>();
	
	// methodos gia prosthiki vivliou stin lista
	public void addBook(Book book) {
		if (book != null) {
		     books.add(book);
		     System.out.println("Book added" + book);
		}
		else {
			System.out.println("Can not add null book");
		}
   }
	    // removes a book from the list if it already exists
		public void removeBook(Book book) {
			if (books.contains(book)) {
				books.remove(book);
				System.out.println("Book removed:" + book ); }
				else {
					System.out.println("Book was not found in the list.");
				}
			}
		// methodos gia na emfanizei thn lista
		public void printBooks() {
			System.out.println("Books in the list:");
			for (Book book : books) {
				System.out.println(book);
			}
		}

		 
		// h updateBook pairnei to id tou book kai kanei update tis idiotites tous
		public List<Book> updateBook(int id, String newTitle ,Author newAuthor, String newPublisher, int newYear, String newDesc, ArrayList<Theme> newThemes) {
			for (Book book : books) {
				if (id == book.getId()) {
					if (newTitle != null)
						book.setTitle(newTitle);;
					if (newAuthor != null)
						book.setAuthor(newAuthor);
					if (newPublisher != null)
						book.setPublisher(newPublisher);
					if (newYear != 0)
						book.setPublishedYear(newYear);
					if (newDesc != null)
						book.setDescription(newDesc);
					if (newThemes != null)
						book.setThemes(newThemes);				
				}
			}
			return books;
		}
		
		
		 // methodos pou tha pairnei to id tou theme kai tha to prosthetei sto id tou book
		 // methodos pou tha pairnei to id kai to theme tou vivliou
				 public List<Book> getbookinfo(int book_id, int theme_id) {
					    for (Book book : books) {
					        if (book.getId() == book_id) {
					            List<Theme> themes = themeServices.getAllThemes();
					            for (Theme theme : themes) {
					                if (theme.getId() == theme_id) {
					                    System.out.println("Book: " + book + " is linked to Theme: " + theme);
					                }
					            }
					        }
					    }
					    return books;
					}
}

