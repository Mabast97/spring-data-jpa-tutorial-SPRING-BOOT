package com.dailycodebuffer.spring.data.jpa.tutorial;

import com.dailycodebuffer.spring.data.jpa.tutorial.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaTutorialApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDataJpaTutorialApplication.class, args);
		System.out.print("Done");
	}


}
