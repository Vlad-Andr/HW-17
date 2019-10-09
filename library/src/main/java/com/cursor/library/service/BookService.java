package com.cursor.libraryserver.service;

import com.cursor.libraryserver.model.Book;

import java.util.List;

public interface BookService {

    void addBook(Book book);

    void deleteBook(Long id);

    List<Book> getBooksByGenre(String genre);

    List<Book> getBooksByAuthor(Long authorId);

}
