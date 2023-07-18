package kz.nurs.storebookservice;

import kz.nurs.storebookservice.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class StoreBookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreBookServiceApplication.class, args);
    }

    @Bean
    public Consumer<Book> bookProcessing() {
        return value -> System.out.println(value);
    }
}
