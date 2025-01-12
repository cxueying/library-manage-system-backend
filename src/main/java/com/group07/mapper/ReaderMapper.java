package com.group07.mapper;

import com.group07.entity.Reader;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReaderMapper {
    List<Reader> getAllReaders();

    Reader getReaderById(Integer readerId);

    int addReader(Reader reader);

    int editReader(Reader reader);

    boolean deleteReader(Integer readerId);
}