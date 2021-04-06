package com.ssafy.j301;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class J301Application {

	public static void main(String[] args) {
		SpringApplication.run(J301Application.class, args);
	}

}
