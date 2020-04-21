package com.greenwavesystems.actuatorpromtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ActuatorpromtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorpromtestApplication.class, args);
	}

	public LoginCounterService loginService;

	public ActuatorpromtestApplication(LoginCounterService loginService) {
		this.loginService = loginService;
		loginService.increment();
	}
}
