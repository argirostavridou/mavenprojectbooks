package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.all.Author;
import com.example.demo.all.AuthorServices;
import com.example.demo.all.Book;
import com.example.demo.all.BookServices;
import com.example.demo.all.Theme;
import com.example.demo.all.ThemeServices;
@SpringBootApplication // einai h basiki endeixi gia tin ekkinish mias spring booth efarmogis
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); // auti i grammi xekina tin spring booth efarmogi
//		
//		// Dimiourgia uphresiwn
//		// Dimiourgei antikeimena gia tiw uphresies
//		ThemeServices themeServices = new ThemeServices();
//		AuthorServices authorServices = new AuthorServices();
//		BookServices bookServices = new BookServices(authorServices,themeServices);
//	
//		// ektelesi twn methodwn
//		themeServices.getAllThemes().forEach(x -> System.out.println(x.toString()));
//		themeServices.addTheme(new Theme(1, "themename1", "theme discription"));
//		themeServices.getAllThemes().forEach(x -> System.out.println(x.toString()));
//		themeServices.addTheme(new Theme(1, "themename2", "theme discription"));
//		themeServices.getAllThemes().forEach(x -> System.out.println(x.toString()));
//		themeServices.removeTheme(1);
//		System.out.println("after delete");
//		themeServices.getAllThemes().forEach(x ->System.out.println());
//		System.out.println("////");
//		// Tha dokimasw thn update methodo tou themeServices
//		// Emfanisi twn thematwn prin to update
//		System.out.println("Themes before update:");
//        themeServices.getAllThemes().forEach(System.out::println);
//        // Dokimase to update tou thematos
//        System.out.println("\nUpdating Theme with id 2...");
//        themeServices.updateTheme(2, "Updated Sci-Fi", "Updated description for sci-fi books");
//        // Emfanisi twn thematwn meta to update
//        System.out.println("Themes after update:");
//        themeServices.getAllThemes().forEach(System.out::println);
//	
//		// Dokimes gia ta AutorServices
//        // Add Authors
//        authorServices.addAuthor(new Author(1, "George", "Orwell", "1903-06-25"));
//        authorServices.addAuthor(new Author(2, "Jane", "Austen", "1775-12-16"));
//        authorServices.addAuthor(new Author(3, "Mark", "Twain", "1835-11-30"));
//        // Print authors before update
//        System.out.println("\nAuthors before update:");
//        authorServices.printAuthors();
//        // Update Author
//        System.out.println("\nUpdating Author with id 2...");
//        authorServices.updateAuthor(2, "Jane Updated", "1775-01-01");
//
//        // print all authors after update
//        System.out.println("\nAuthors after update:");
//        authorServices.printAuthors();
//		// dokimase ta services gia to book
//        // Create books
//        Author author1 = new Author(1, "George", "Orwell", "1903-06-25");
//        Author author2 = new Author(2, "Jane", "Austen", "1775-12-16");
//
//        
//        Book book1 = new Book(1, "1984", author1, "Secker & Warburg", 1949, "A dystopian novel", new ArrayList<>());
//        Book book2 = new Book(2, "Harry Potter and the Philosopher's Stone", author2, "Bloomsbury", 1997, "A fantasy novel", new ArrayList<>());
//
//        // add books
//        bookServices.addBook(book1);
//        bookServices.addBook(book2);
//		
//        // Print books after adding
//        System.out.println("\nBooks after adding:");
//        bookServices.printBooks();

	}

}

//
