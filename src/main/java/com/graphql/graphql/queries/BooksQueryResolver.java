package com.graphql.graphql.queries;

import com.graphql.models.Book;
import com.graphql.services.BookService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BooksQueryResolver implements GraphQLQueryResolver {

    private final BookService bookService;

    public List<Book> getAllBooks() {
        List<Book> allBook = bookService.getAllBooks();
        return allBook;
    }

    public Book getBookById(Integer bookID) {
        Book book = bookService.getBookById(Long.valueOf(bookID));
        return book;
    }
}
