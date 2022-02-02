package com.dailycodebuffer.spring.data.jpa.tutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@yahoo.com",
                    LocalDate.of(1997, Month.APRIL, 7));

            Student alex = new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(1990, Month.JANUARY, 18)
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }

}
