package kz.nurs.creationbookservice;

import kz.nurs.creationbookservice.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
public class CreationBookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreationBookServiceApplication.class, args);
    }

    @Bean
    public Supplier<Book> bookProcessing() {
        return () -> Book.builder()
                .id(1)
                .name("Midnight Library")
                .description("What i am reading now")
                .price(1500)
                .status("unchecked")
                .build();
    }
}
