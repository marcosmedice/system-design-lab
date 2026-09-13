package com.study.system_design_lab;

import org.springframework.boot.SpringApplication;

public class TestSystemDesignLabApplication {

	public static void main(String[] args) {
		SpringApplication.from(SystemDesignLabApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
