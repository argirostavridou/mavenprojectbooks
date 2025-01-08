package themes;

import java.util.ArrayList;
import java.util.List;

public class ThemeServices {

	//Themes
	private List<Theme> themes = new ArrayList<Theme>();
	
	//methods
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
		
	}
	// removes a theme from the list if it already exists
	public void removeTheme(Theme theme) {
		if (themes.contains(theme)) {
			themes.remove(theme);
			System.out.println("Theme removed:" + theme ); }
			else {
				System.out.println("Theme was not found in the list.");
			}
		}
	// methodos gia na emfanizei thn lista
	public void printThemes() {
		System.out.println("Themes in the list:");
		for (Theme theme : themes) {
			System.out.println(theme);
		}
		}
	
	// methodos pou na kanei update
	
}
