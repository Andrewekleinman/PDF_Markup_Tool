package com.example.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Configuration
@SpringBootApplication
@Controller
public class Serve {

	@GetMapping("/")
	public String serve() throws IOException {
		//hosts the html file by the same name
		return "/served.html";
	}

}
