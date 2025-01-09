package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Comtroller {
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Theme controller";
	}
}
