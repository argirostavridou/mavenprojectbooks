package com.example.demo.all;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServices {
    @Autowired
    private AuthorServices authorServices;
    @Autowired
    private ThemeServices themeServices; 

    // Constructor
    public BookServices(AuthorServices authorServices, ThemeServices themeServices) {
        this.authorServices = authorServices;
        this.themeServices = themeServices;
    }

    // List with all books
    private List<Book> books = new ArrayList<>();

    
    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
            System.out.println("Book added: " + book);
        } else {
            System.out.println("Cannot add a null book.");
        }
    }

    
    public void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book removed: " + book);
        } else {
            System.out.println("Book was not found in the list.");
        }
    }

    
    public void printBooks() {
        System.out.println("Books in the list:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    
    public List<Book> updateBook(int id, String newTitle, Author newAuthor, String newPublisher, int newYear,
                                 String newDesc, ArrayList<Theme> newThemes) {
        for (Book book : books) {
            if (id == book.getId()) {
                if (newTitle != null)
                    book.setTitle(newTitle);
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

    
    public List<Book> updateBookAuthor(int idBook, int idAuthor) {
        for (Book book : books) {
            if (idBook == book.getId()) {
                for (Author author : authorServices.getAuthors()) {
                    if (author.getId() == idAuthor) {
                        book.setAuthor(author);
                        break;
                    }
                }
            }
        }
        return books;
    }

    
    public List<Book> addBookTheme(int idBook, int idTheme) {
        
        List<Theme> allThemes = themeServices.getAllThemes();
        for (Book book : books) {
            if (idBook == book.getId()) {
                for (Theme theme : allThemes) {
                    if (theme.getId() == idTheme) {
                        book.addTheme(theme);
                        break; //
                    }
                }
            }
        }
        return books;
    }
}
