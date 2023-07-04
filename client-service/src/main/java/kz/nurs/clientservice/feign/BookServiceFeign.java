package kz.nurs.clientservice.feign;

import kz.nurs.clientservice.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-service")
public interface BookServiceFeign {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}
