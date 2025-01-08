package books;
import java.util.ArrayList;
import java.util.List;

import authors.Author;
import authors.AuthorServices;
import themes.Theme;
import themes.ThemeServices;


public class BookServices {
    
	AuthorServices authorServices;
	ThemeServices themeServices;
	
	public BookServices(AuthorServices a, ThemeServices b) {
		authorServices = a;
		themeServices = b;
	}
	
	
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

		// methodos pou tha pairnei to id tou theme kai tha to prosthetei sto id tou book
				 public List<Book> updateBook(int id, String new_title, Author new_author){
				     for (Book book : books) {
				    	 if (book.getId() == id) {
				    		 if (new_title != null)
				    			 book.setTitle(new_title);
				    		 if (new_author != null)
				    		     book.setAuthor(new_author);
				    		 		    		 
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

