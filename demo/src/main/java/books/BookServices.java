package books;
import java.util.ArrayList;
import java.util.List;





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
	}
