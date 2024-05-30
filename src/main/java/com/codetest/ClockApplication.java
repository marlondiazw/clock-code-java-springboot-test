package com.codetest;

import com.codetest.thread.ClockExecutor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClockApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClockApplication.class, args);
	}

	@Override
	public void run(String... args) {
		ClockExecutor.run();
	}
}
