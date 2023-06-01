package com.example.movieApp;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.slf4j.Logger;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
//@ComponentScan(basePackages = {"com.example.movieApp.repository"}) // Works with this one
@EnableJpaRepositories(basePackages = "com.example.movieApp.repository")
public class MovieAppApplication {
	private static final Logger LOG = LoggerFactory.getLogger(MovieAppApplication.class);

	public static void main(String[] args) {
		LOG.info("Starting application...");

		SpringApplication.run(MovieAppApplication.class, args);
	}

}
