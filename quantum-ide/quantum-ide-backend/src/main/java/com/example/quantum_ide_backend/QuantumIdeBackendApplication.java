package com.example.quantum_ide_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.quantum_ide_backend.controller")
public class QuantumIdeBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuantumIdeBackendApplication.class, args);
	}

}