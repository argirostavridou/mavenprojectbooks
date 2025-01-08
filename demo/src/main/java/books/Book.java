package books;

import java.util.List;

import authors.Author;
import themes.Theme;

public class Book {
      public int id;
      public String title;
      public Author author;
      public String publisher;
      public String publishedYear;
      public String description;
      public List<Theme> theme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Theme> getTheme() {
		return theme;
	}
	public void setThemes(List<Theme> theme) {
		this.theme = theme;
	}
}
