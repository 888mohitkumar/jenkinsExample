package com.jenkins.jenkinsExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsExampleApplication.class, args);
		demo();
	}
	public static void demo()
	{
		System.out.println("Hello jenkins !!!!");
		System.out.println("Hello jenkins2 !!!!");
		System.out.println("Hello jenkins3 !!!!");
		System.out.println("Hello jenkins4 !!!!");
	}
}
