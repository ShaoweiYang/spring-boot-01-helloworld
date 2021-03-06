package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("sampleController")
@EnableAutoConfiguration
public class HelloApplication {
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/abc")
	@ResponseBody
	public String abc() {
		return "<h1 style='color:red'>abc!</h1>";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
