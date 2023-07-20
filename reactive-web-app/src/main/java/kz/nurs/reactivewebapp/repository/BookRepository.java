package kz.nurs.reactivewebapp.repository;

import kz.nurs.reactivewebapp.model.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
}
