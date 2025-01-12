package com.group07.service.impl;

import com.group07.entity.BorrowRecord;
import com.group07.mapper.BorrowRecordMapper;
import com.group07.service.IBorrowRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowRecordServiceImpl implements IBorrowRecordService {
    @Autowired
    private BorrowRecordMapper borrowRecordMapper;

    @Override
    public List<BorrowRecord> getAllBorrowRecords() {
        return borrowRecordMapper.getAllBorrowRecords();
    }

    @Override
    public List<BorrowRecord> getBorrowRecordByReaderId(Integer readerId) {
        return borrowRecordMapper.getBorrowRecordByReaderId(readerId);
    }

    @Override
    public int addBorrowRecord(BorrowRecord borrowRecord) {
        return borrowRecordMapper.addBorrowRecord(borrowRecord);
    }

    @Override
    public int editBorrowRecord(BorrowRecord borrowRecord) {
        return borrowRecordMapper.editBorrowRecord(borrowRecord);
    }

    @Override
    public boolean deleteBorrowRecord(Integer recordId) {
        return borrowRecordMapper.deleteBorrowRecord(recordId);
    }
}