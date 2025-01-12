package com.group07.controller;

import com.group07.entity.Reader;
import com.group07.service.IReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
public class ReaderController {

    @Autowired
    private IReaderService readerService;

    @GetMapping("/all")
    public List<Reader> getAllReaders() {
        return readerService.getAllReaders();
    }

    @GetMapping("/by-id/{readerId}")
    public Reader getReaderById(@PathVariable("readerId") Integer readerId) {
        Reader reader = readerService.getReaderById(readerId);
        Assert.notNull(reader, "所查读者不存在");
        return readerService.getReaderById(readerId);
    }

    @PostMapping("/add")
    public int addReader(@RequestBody Reader reader) {
        return readerService.addReader(reader);
    }

    @PutMapping("/edit")
    public int editReader(@RequestBody Reader reader) {
        return readerService.editReader(reader);
    }

    @GetMapping("/delete/{readerId}")
    public boolean deleteReader(@PathVariable("readerId") Integer readerId) {
        return readerService.deleteReader(readerId);
    }
}