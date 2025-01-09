package Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import themes.ThemeServices;

@RestController
@RequestMapping("themes")
public class ThemeController {
	
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Theme controller";
	}

}
