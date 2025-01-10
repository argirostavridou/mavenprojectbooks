package com.example.demo;
import com.example.demo.all.Book;
import com.example.demo.all.BookServices;
import com.example.demo.all.Author;
import com.example.demo.all.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookServices bookServices;

    // add book
    @PostMapping("/add")
    public String addBook(@RequestBody Book book) {
        bookServices.addBook(book);
        return "Book added succesfully : " + book.getTitle();
    }

    // delete book
    @DeleteMapping("/delete")
    public String removeBook(@RequestBody Book book) {
        bookServices.removeBook(book);
        return "Book deleted: " + book.getTitle();
    }

    // lhpsh twn books
    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookServices.getBooks();
    }

    // Endpoint for update book
    @PutMapping("/update")
    public String updateBook(
            @RequestParam int id,
            @RequestParam(required = false) String newTitle,
            @RequestParam(required = false) Author newAuthor,
            @RequestParam(required = false) String newPublisher,
            @RequestParam(required = false) int newYear,
            @RequestParam(required = false) String newDesc,
            @RequestBody(required = false) ArrayList<Theme> newThemes
    ) {
        bookServices.updateBook(id, newTitle, newAuthor, newPublisher, newYear, newDesc, newThemes);
        return "Book updated.";
    }

    // Endpoint for updateBookAuthor
    @PutMapping("/update-author")
    public String updateBookAuthor(@RequestParam int idBook, @RequestParam int idAuthor) {
        bookServices.updateBookAuthor(idBook, idAuthor);
        return "Book author updated.";
    }

    // Endpoint adding theme to the book
    @PutMapping("/add-theme")
    public String addBookTheme(@RequestParam int idBook, @RequestParam int idTheme) {
        bookServices.addBookTheme(idBook, idTheme);
        return "Theme added to the book.";
    }
}
}
