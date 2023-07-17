package kz.nurs.creationbookservice.service;

import kz.nurs.creationbookservice.model.Book;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Source.class)
public class BookCreationService {

    private final Source source;

    public BookCreationService(Source source) {
        this.source = source;
    }

    @Scheduled(fixedRate = 10000)
    private void sendBooks() {
        Book book = Book.builder()
                .id(1)
                .name("Midnight Library")
                .description("What i am reading now")
                .price(1500)
                .status("unchecked")
                .build();
        source.output().send(MessageBuilder.withPayload(book).build());
    }
}
