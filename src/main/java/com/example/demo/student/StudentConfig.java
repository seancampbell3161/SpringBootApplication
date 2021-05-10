package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return arg -> {
            Student mariam =new Student(
                    1L,
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    21
            );

            Student bob = new Student(
                    "Bob",
                    "bob.jones@gmail.com",
                    LocalDate.of(1986, JANUARY, 14),
                    21
            );

            repository.saveAll(
                    List.of(mariam, bob)
            );
        };
    }
}
