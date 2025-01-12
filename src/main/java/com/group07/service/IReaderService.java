package com.group07.service;

import com.group07.entity.Reader;

import java.util.List;

public interface IReaderService {
    List<Reader> getAllReaders();

    Reader getReaderById(Integer readerId);

    int addReader(Reader reader);

    int editReader(Reader reader);

    boolean deleteReader(Integer readerId);
}