package com.group07.service;

import com.group07.entity.BorrowRecord;

import java.util.List;

public interface IBorrowRecordService {
    List<BorrowRecord> getAllBorrowRecords();

    List<BorrowRecord> getBorrowRecordByReaderId(Integer readerId);

    int addBorrowRecord(BorrowRecord borrowRecord);

    int editBorrowRecord(BorrowRecord borrowRecord);

    boolean deleteBorrowRecord(Integer recordId);
}