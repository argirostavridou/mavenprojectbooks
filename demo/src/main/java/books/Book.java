package books;

import java.util.ArrayList;
import java.util.List;

import authors.Author;
import themes.Theme;

public class Book {
	public int id;
	public String title;
	public Author author;
	public String publisher;
	public int publishedYear;
	public String description;
	public List<Theme> themes;

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

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Theme> getTheme() {
		return themes;
	}

	public void setThemes(List<Theme> theme) {
		this.themes = themes;
	}

	// prosthiki thematos stin lista
	public void addTheme(Theme theme) {
		if (this.themes == null) {
			this.themes = new ArrayList<>();
		}else {
			this.themes.add(theme);
		}
	}
}
