package com.group07.service.impl;

import com.group07.entity.Reader;
import com.group07.mapper.ReaderMapper;
import com.group07.service.IReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderServiceImpl implements IReaderService {
    @Autowired
    private ReaderMapper readerMapper;

    @Override
    public List<Reader> getAllReaders() {
        return readerMapper.getAllReaders();
    }

    @Override
    public Reader getReaderById(Integer readerId) {
        return readerMapper.getReaderById(readerId);
    }

    @Override
    public int addReader(Reader reader) {
        return readerMapper.addReader(reader);
    }

    @Override
    public int editReader(Reader reader) {
        return readerMapper.editReader(reader);
    }

    @Override
    public boolean deleteReader(Integer readerId) {
        return readerMapper.deleteReader(readerId);
    }
}