package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.all.Theme;
import com.example.demo.all.ThemeServices;

@RestController
@RequestMapping("themes")
public class Controller {
    @Autowired
    ThemeServices themeServices;
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Theme controller";
	}
	@GetMapping("/all")
	public List<Theme> getThemesAll() {
		return themeServices.getAllThemes();
	}
	@PostMapping("/add")
	public List<Theme> addTheme(@RequestBody Theme theme){
		return themeServices.addTheme(theme);
	}
	
	@DeleteMapping("/delete")
	public List<Theme> deleteTheme(@RequestParam Integer id){
		
		return themeServices.removeTheme(id);
	}
	
}



