package authors;

import java.util.ArrayList;
import java.util.List;

import themes.Theme;

public class AuthorServices {
	
	private List<Author> authors = new ArrayList<Author>();
	
	// Prepei na kanoume methodous gia leitourgikothtes prosthiki/diagrafi stin lista
	//adds a new theme to the list themes
		public void addAuthor(Author author) {
			if (author != null) {
			     authors.add(author);
			     System.out.println("Author added" + author);
			}
			else {
				System.out.println("Can not add null author");
			}
			
		}
}
