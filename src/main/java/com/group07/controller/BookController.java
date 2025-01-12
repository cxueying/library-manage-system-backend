package com.group07.controller;

import com.group07.entity.Book;
import com.group07.service.IBookService;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Resource
    private IBookService bookService;

    @GetMapping("/query/{searchWord}")
    public List<Book> queryBook(@PathVariable("searchWord") String searchWord) {
        try {
            // 解码 searchWord 参数
            searchWord = URLDecoder.decode(searchWord, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        List<Book> books = bookService.queryBook(searchWord);
        Assert.notNull(books, "未找到匹配的书籍");
        return books;
    }

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        Assert.notNull(books, "书籍列表为空");
        return books;
    }

    @PostMapping("/add")
    public boolean addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/by-id/{bookId}")
    public Book getBookById(@PathVariable("bookId") Integer bookId) {
        Book book = bookService.getBookById(bookId);
        Assert.notNull(book, "所查书籍不存在");
        return book;
    }

    @PostMapping("/edit")
    public boolean editBook(@RequestBody Book book) {
        return bookService.editBook(book);
    }

    @GetMapping("/delete/{bookId}")
    public boolean deleteBook(@PathVariable("bookId") Integer bookId) {
        return bookService.deleteBook(bookId);
    }
}