package kz.nurs.checkbookservice.service;

import kz.nurs.checkbookservice.model.Book;
import org.apache.kafka.common.protocol.Message;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Processor.class)
@MessageEndpoint
public class BookManagingService {

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public Book handleMessage(Book book) throws Exception {
        book.setStatus("checked");
        return book;
    }

}
