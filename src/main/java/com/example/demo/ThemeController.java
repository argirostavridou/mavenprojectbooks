package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; // Gia injection tou ThemeServices
import org.springframework.web.bind.annotation.DeleteMapping;  // Gia DELETE aitimata
import org.springframework.web.bind.annotation.GetMapping; // Gia GET aitimata
import org.springframework.web.bind.annotation.PostMapping; // Gia POST aitimata
import org.springframework.web.bind.annotation.RequestBody; // Gia na lavoume to soma enos POST request
import org.springframework.web.bind.annotation.RequestMapping; // Gia na orisoume to base URL tou controller
import org.springframework.web.bind.annotation.RequestParam; // Gia na lavoume parametrous apo GET/DELETE requests
import org.springframework.web.bind.annotation.RestController; // Dilonei oti einai REST Controller

import com.example.demo.all.Theme; // To model pou antiprosopevei ena "Theme"
import com.example.demo.all.ThemeServices; // H yphresia pou xeirizetai th logikh gia ta "Theme"

@RestController // Dilwnei oti auti h klash einai enas controller pou tha epistrefei dedomena se JSON format
@RequestMapping("themes") // Orizei thn vasili diadromi gia ola ta endpoints auths ths klashs
                          // Diladi ola ta URLs pou diaxeirizetai autos o controller xekinoun me /users
public class ThemeController {
    @Autowired // INJECTION h klasi xreiazetai to monadiko antikeimeno themeServices pou exeis
    ThemeServices themeServices; // Kanoume injection to antikeimeno themeServices gia xrhsh mesa ston controller
    
    // Endpoint gia GET sto /themes/hello
	@GetMapping("/hello") //otan o pelatis kanei aitima GET sto /themes/hello h methodos hello ekteleite
	public String hello() {
		return "Hello from Theme controller"; // Epistrefei aplo string san apantisi
	}
	
	@GetMapping("/all") // Endpoint gia GET sto /themes/all
	public List<Theme> getThemesAll() {
		return themeServices.getAllThemes(); // Epistrefei oles tis eggrafes "Theme"
	}
	
	
	@PostMapping("/add") // Endpoint gia POST sto /themes/add
	public List<Theme> addTheme(@RequestBody Theme theme){ // to @RequestBody Dinei prosvasi sta dedomena tou body enos POST request.
		return themeServices.addTheme(theme); // Prosthetei ena kainourio "Theme" kai epistrefei th nea lista
	}
	
	// prosthetw tin methodo tis ThemeServices pou dexetai JSON se morfi listas
	@PostMapping("/addMany")
	public List<Theme> addManyThemes(@RequestBody List<Theme> themes){
		return themeServices.addManyThemes(themes);
	}
	
	
	@DeleteMapping("/delete") // Endpoint gia DELETE sto /themes/delete
	public void deleteTheme(@RequestParam Integer id){ // to @RequestPsram dinei prosvasi se parametrous pou erxontai apo to URL enos GET/DELETE request.
		themeServices.removeTheme(id);	// Diagrafei to "Theme" me to sygkekrimeno ID
		return ; // Den epistrefei kati
	} 
	
}



