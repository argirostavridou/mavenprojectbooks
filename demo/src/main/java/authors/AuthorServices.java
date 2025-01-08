package authors;

import java.util.ArrayList;
import java.util.List;

import themes.Theme;

public class AuthorServices {
	
	private List<Author> authors = new ArrayList<Author>();
	
	// Prepei na kanoume methodous gia leitourgikothtes prosthiki/diagrafi stin lista
	//adds a new author to the list authors
		public void addAuthor(Author author) {
			if (author != null) {
			     authors.add(author);
			     System.out.println("Author added" + author);
			}
			else {
				System.out.println("Can not add null author");
			}
			
		}
		
		// removes a author from the list if it already exists
		public void removeAuthor(Author author) {
			if (authors.contains(author)) {
				authors.remove(author);
				System.out.println("Author removed:" + author ); }
				else {
					System.out.println("Author was not found in the list.");
				}
			}
		// methodos gia na emfanizei thn lista
		public void printAuthorss() {
			System.out.println("Authors in the list:");
			for (Author author : authors) {
				System.out.println(author);
			}
			}
		
		// methodos pou na kanei update
}
