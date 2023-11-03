package com.aul6.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.aul6.api.repository")
@EntityScan(basePackages = "com.aul6.api.model")
@SpringBootApplication

public class ApiAula6Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiAula6Application.class, args);
	}

}
