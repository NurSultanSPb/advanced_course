package kz.nurs.clientservice.controller;

import kz.nurs.clientservice.feign.BookServiceFeign;
import kz.nurs.clientservice.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
public class ClientController {

    private final BookServiceFeign bookServiceFeign;

    @GetMapping("/books")
    public List<Book> getAllBooksFromClient() {
        return bookServiceFeign.getAllBooks();
    }
}
