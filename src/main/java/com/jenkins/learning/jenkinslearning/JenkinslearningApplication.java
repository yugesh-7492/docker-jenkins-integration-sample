package com.jenkins.learning.jenkinslearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinslearningApplication {

	@GetMapping("/welcome")
	public String hello(){

		System.out.println("welcome has been callde");

		 return "welcome to learn the jenking cicd pipeline";

	}


//	echo "# docker-jenkins-integration-sample" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/yugesh-7492/docker-jenkins-integration-sample.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(JenkinslearningApplication.class, args);
	}

}
