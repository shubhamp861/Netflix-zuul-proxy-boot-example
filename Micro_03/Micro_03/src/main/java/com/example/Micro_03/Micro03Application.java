package com.example.Micro_03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Micro03Application {

	public static void main(String[] args) {
		SpringApplication.run(Micro03Application.class, args);
	}

	@GetMapping("/abc")
	public String hello(){
		String s = "Hello from micro_02";
		return s;
	}

}
