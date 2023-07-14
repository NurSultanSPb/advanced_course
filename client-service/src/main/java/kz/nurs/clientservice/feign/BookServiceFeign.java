package kz.nurs.clientservice.feign;

import kz.nurs.clientservice.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@FeignClient(name = "book-service", fallback = BookServiceFeign.Fallback.class)
public interface BookServiceFeign {
    @GetMapping("/api/books")
    List<Book> getAllBooks();

    @Component
    class Fallback implements BookServiceFeign {
        @Override
        public List<Book> getAllBooks() {
            return Collections.emptyList();
        }
    }
}
