package kz.nurs.bookservice.service;

import kz.nurs.bookservice.dao.BookRepository;
import kz.nurs.bookservice.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
