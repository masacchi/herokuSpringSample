package jp.masato.spring.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by masato on 2017/07/17 11:15.
 */

@Controller
@EnableAutoConfiguration
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello, Spring Boot!";
	}

	public static void main(String[] arguments) {
		SpringApplication.run(HelloController.class, arguments);
	}

}


