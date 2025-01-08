package themes;

import java.util.ArrayList;
import java.util.List;

public class ThemeServices {

	//Themes
	private List<Theme> themes = new ArrayList<Theme>();
	
	//methods
	
	public List<Theme> getAllThemes() {
	    return themes;
	}
	// Prepei na kanoume methodous gia leitourgikothtes prosthiki/diagrafi stin lista
	//adds a new theme to the list themes
	public void addTheme(Theme theme) {
		if (theme != null) {
		     themes.add(theme);
		     System.out.println("Theme added" + theme);
		}
		else {
			System.out.println("Can not add null theme");
		}
		// na valw return
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
