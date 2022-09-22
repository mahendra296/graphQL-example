package com.graphql.services;

import com.graphql.models.Book;
import com.graphql.repository.BookRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class BookService {

  private final BookRepository bookRepository;

  public List<Book> getAllBooks() {
    List<Book> allBook = bookRepository.findAll();
    return allBook;
  }

  public Book getBookById(Long bookID) {
    Optional<Book> book = bookRepository.findById(bookID);
    return book.orElse(null);
  }

  public void saveBook(Book book) {
    try {
      bookRepository.save(book);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
