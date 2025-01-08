package books;
import java.util.ArrayList;
import java.util.List;

import themes.Theme;





public class BookServices {

	private List<Book> books = new ArrayList<Book>();
	
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
		
		// methodos pou na kanei update
	
}
