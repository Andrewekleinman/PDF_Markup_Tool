package com.example.springboot;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class PdfController {

	@GetMapping("/image")
	public void getImage(HttpServletResponse response) throws IOException {
		//load a pdf from the resources/image directory
		ClassPathResource imgFile = new ClassPathResource("image/sample.pdf");
		//basic verification for the file
		System.out.println(imgFile.exists());
		System.out.println(imgFile.getFilename());
		//serve the file
		response.setContentType(MediaType.APPLICATION_PDF_VALUE);
		StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
	}
}
