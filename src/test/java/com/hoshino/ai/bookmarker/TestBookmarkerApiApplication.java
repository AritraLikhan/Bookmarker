package com.hoshino.ai.bookmarker;

import org.springframework.boot.SpringApplication;

public class TestBookmarkerApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookmarkerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
