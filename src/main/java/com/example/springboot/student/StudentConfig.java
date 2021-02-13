package com.example.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import static java.time.Month.AUGUST;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner runner (StudentRepository repository){
        return args -> {
            repository.save(new Student("Joseph", "j@j.j",LocalDate.of(1966, AUGUST,5)));
            repository.save(new Student("Muiruri", "m@j.me",LocalDate.of(1995, AUGUST,5)));
            repository.save(new Student("Mariam","Mariam@gmail.com",LocalDate.of(1978, AUGUST,5)));
        };
    }
}
