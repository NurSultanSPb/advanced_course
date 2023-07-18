package kz.nurs.checkbookservice;

import kz.nurs.checkbookservice.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class CheckBookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheckBookServiceApplication.class, args);
    }

    @Bean
    public Function<Book, Book> bookProcessing() {
        return value -> value.setStatus("checked");
    }
}
