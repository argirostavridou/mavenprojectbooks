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
		
		// methodos pou tha pernei to id tou author kai tha kanei update to onoma kai date
		public List<Theme> updateAuthor(int id, String new_name, String new_date){
			for (Author author : authors) {
				if (author.getId() == id) {
					if (new_name != null)
						author.setFirstName(new_name);
					if (new_date != null)
						author.setDateOfBirth(new_date);;
				}
			}
			return null;
		}

		public List<Author> getAuthors() {
			
			return this.authors;
		}

}
		
		
		

