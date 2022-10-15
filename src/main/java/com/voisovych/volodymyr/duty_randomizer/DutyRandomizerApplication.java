package com.voisovych.volodymyr.duty_randomizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class DutyRandomizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DutyRandomizerApplication.class, args);
	}

}
