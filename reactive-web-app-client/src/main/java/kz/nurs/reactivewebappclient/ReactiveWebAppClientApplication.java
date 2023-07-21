package kz.nurs.reactivewebappclient;

import kz.nurs.reactivewebappclient.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ReactiveWebAppClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReactiveWebAppClientApplication.class, args);
        String url = "http://localhost:8080/api/books";
        WebClient.Builder builder = WebClient.builder();
        builder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToFlux(Book.class)
                .subscribe(System.out::println);

        builder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToFlux(Book.class)
                .last()
                .subscribe(s -> System.out.println("The last element is: " + s));
    }

}
