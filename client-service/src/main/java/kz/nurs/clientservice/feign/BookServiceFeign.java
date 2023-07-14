package kz.nurs.clientservice.feign;

import kz.nurs.clientservice.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@FeignClient(name = "book-service", fallbackFactory = BookServiceFeignFallbackFactory.class)
public interface BookServiceFeign {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}

@Component
class BookServiceFeignFallbackFactory implements FallbackFactory<FallbackWithFactory> {

    @Override
    public FallbackWithFactory create(Throwable cause) {
        return new FallbackWithFactory(cause.getMessage());
    }
}

@Slf4j
record FallbackWithFactory(String reason) implements BookServiceFeign {
    @Override
    public List<Book> getAllBooks() {
        log.info("Failed send request on book service, reason {}", reason);
        return Collections.emptyList();
    }
}

