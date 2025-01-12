package com.group07.service.impl;

import com.group07.entity.Book;
import com.group07.mapper.BookMapper;
import com.group07.service.IBookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class BookServiceImpl implements IBookService {
    @Resource
    private BookMapper mapper;

    @Override
    public ArrayList<Book> queryBook(String searchWord) {
        return mapper.queryBook(searchWord);
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return mapper.getAllBooks();
    }

    @Override
    public boolean addBook(Book book) {
        return mapper.addBook(book);
    }

    @Override
    public Book getBookById(Integer bookId) {
        return mapper.getBookById(bookId);
    }

    @Override
    public boolean editBook(Book book) {
        return mapper.editBook(book);
    }

    @Override
    public boolean deleteBook(Integer bookId) {
        return mapper.deleteBook(bookId);
    }
}
