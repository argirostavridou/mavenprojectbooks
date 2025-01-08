package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import authors.AuthorServices;
import books.BookServices;
import themes.ThemeServices;
import themes.Theme;
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		ThemeServices themeServices = new ThemeServices();
		AuthorServices authorServices = new AuthorServices();
		BookServices bookServices = new BookServices(authorServices,themeServices);
	
		themeServices.getAllThemes().forEach(x -> System.out.println(x.toString()));
		themeServices.addTheme(new Theme(1, "themename1", "theme discription"));
		themeServices.getAllThemes().forEach(x -> System.out.println(x.toString()));
		themeServices.addTheme(new Theme(1, "themename2", "theme discription"));
		themeServices.getAllThemes().forEach(x -> System.out.println(x.toString()));
		themeServices.removeTheme(1);
		System.out.println("after delete");
		themeServices.getAllThemes().forEach(x ->System.out.println());
		System.out.println("////");
		
	}

}


