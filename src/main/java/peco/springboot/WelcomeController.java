package peco.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {

	Logger LOGGER=LoggerFactory.getLogger(WelcomeController.class);
	
	public static void main(String[] args) {
		SpringApplication.run(WelcomeController.class, args);
		
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "Master Branch";
		
	}
}
