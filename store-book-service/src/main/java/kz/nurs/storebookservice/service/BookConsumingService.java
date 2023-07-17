package kz.nurs.storebookservice.service;

import kz.nurs.storebookservice.model.Book;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
@EnableBinding(Sink.class)
public class BookConsumingService {

    private Logger logger = Logger.getLogger(BookConsumingService.class.getName());

    @StreamListener(target = Sink.INPUT)
    public void handleMessage(Book book) throws Exception {
        logger.log(Level.INFO, "Message read " + book.toString());
    }

}
