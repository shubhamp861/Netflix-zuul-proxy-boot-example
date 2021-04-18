package com.example.Micro_04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Micro04Application {

	public static void main(String[] args) {
		SpringApplication.run(Micro04Application.class, args);
	}
	@GetMapping("/abcd")
	public String hello(){
		String s = "Hello from micro_04";
		return s;
	}
}
