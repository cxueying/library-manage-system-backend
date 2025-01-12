package com.group07.service;

import com.group07.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> queryBook(String searchWord);

    List<Book> getAllBooks();

    boolean addBook(Book book);

    Book getBookById(Integer bookId);

    boolean editBook(Book book);

    boolean deleteBook(Integer bookId);


}
