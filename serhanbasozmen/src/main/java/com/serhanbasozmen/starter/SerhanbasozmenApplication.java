package com.serhanbasozmen.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.serhanbasozmen")
@SpringBootApplication
public class SerhanbasozmenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerhanbasozmenApplication.class, args);
	}

}
