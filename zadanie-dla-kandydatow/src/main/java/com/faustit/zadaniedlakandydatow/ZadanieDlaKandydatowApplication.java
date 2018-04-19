package com.faustit.zadaniedlakandydatow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.Validator;

@SpringBootApplication
public class ZadanieDlaKandydatowApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZadanieDlaKandydatowApplication.class, args);
	}

	@Bean
	public Validator validator() {
		return new LocalValidatorFactoryBean();
	}
}
