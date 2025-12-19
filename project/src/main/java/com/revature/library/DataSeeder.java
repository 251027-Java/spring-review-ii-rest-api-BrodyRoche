package com.revature.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.library.model.Book;
import com.revature.library.repository.BookRepository;

@Configuration
public class DataSeeder {
    @Bean
    CommandLineRunner seeder(BookRepository bookRepository) {
        return args -> {
            bookRepository.save(new Book("Clean Code", "Robert Martin", "1234567890"));
            bookRepository.save(new Book("The Pragmatic Programmer", "David Thomas", "0987654321"));
            bookRepository.save(new Book("Design Patterns", "Gang of Four", "1122334455"));
            bookRepository.save(new Book("Effective Java", "Joshua Bloch", "5544332211"));
            bookRepository.save(new Book("Spring in Action", "Craig Walls", "6677889900"));
        };
    }
}
