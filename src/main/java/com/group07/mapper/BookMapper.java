package com.group07.mapper;


import com.group07.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface BookMapper {
    ArrayList<Book> queryBook(String searchWord);

    ArrayList<Book> getAllBooks();

    boolean addBook(Book book);

    Book getBookById(Integer id);

    boolean editBook(Book book);

    boolean deleteBook(Integer id);

}
