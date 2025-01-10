package com.example.demo.all;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThemeServices {

	
	@Autowired ThemeRepository repository;
	

	public ThemeServices() {
		super();
	}
	// methodos gia anaktisi olwn twn thematwn
	// epistrefei oli tin lista twn thematwn
	public List<Theme> getAllThemes() {
	    return repository.findAll();
	}
	// Prepei na kanoume methodous gia leitourgikothtes prosthiki/diagrafi stin lista
	//adds a new theme to the list themes
	public List<Theme> addTheme(Theme theme) {
		repository.save(theme);
		return this.getAllThemes();
	}
	// Tha ftiaxw methodo pou na dexetai JSON me polles plirofories me tin morfi listas
	public List<Theme> addManyThemes(List<Theme> list){
		 for (Theme theme : list) {
			 // if() ///
			 // themes.add(theme)
			 this.addTheme(theme);
		 }
		 return this.themes;
	} 
	
	
	// removes a theme from the list if it already exists
	public void removeTheme(int id) {
	    boolean removed = themes.removeIf(theme -> theme.getId() == id);
	    if (removed) {
	        System.out.println("Theme with id " + id + " removed.");
	    } else {
	        System.out.println("Theme with id " + id + " not found.");
	    }
	}
	// methodos gia na emfanizei thn lista
	public void printThemes() {
		System.out.println("Themes in the list:");
		for (Theme theme : themes) {
			System.out.println(theme);
		}
		}
	
	// methodos pou na kanei update to theme stin klasi theme
	public List<Theme> updateTheme(int id, String new_name, String new_description){
	     for (Theme theme : themes) {
	    	 if (theme.getId() == id) {
	    		 if (new_name != null)
	    			 theme.setName(new_name);
	    		 if (new_description != null)
	    		     theme.setDescription(new_description);
	    		 
	    		 
	    	 }
	     }
		     return themes;
    }
}
