package com.group07.mapper;

import com.group07.entity.BorrowRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BorrowRecordMapper {
    List<BorrowRecord> getAllBorrowRecords();

    List<BorrowRecord> getBorrowRecordByReaderId(Integer readerId);

    int addBorrowRecord(BorrowRecord borrowRecord);

    int editBorrowRecord(BorrowRecord borrowRecord);

    boolean deleteBorrowRecord(Integer recordId);
}