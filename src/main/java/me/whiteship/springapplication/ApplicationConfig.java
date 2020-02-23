package me.whiteship.springapplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.print.Book;

@Configuration
public class ApplicationConfig {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public BookService bookService(BookRepository bookRepository) {
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository);
        return bookService;
    }
}
