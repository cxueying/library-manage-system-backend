package com.group07.controller;

import com.group07.entity.BorrowRecord;
import com.group07.service.IBorrowRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrow-record")
public class BorrowRecordController {

    @Autowired
    private IBorrowRecordService borrowRecordService;

    @GetMapping("/all")
    public List<BorrowRecord> getAllBorrowRecords() {
        return borrowRecordService.getAllBorrowRecords();
    }

    @GetMapping("/by-reader/{readerId}")
    public List<BorrowRecord> getBorrowRecordByReaderId(@PathVariable("readerId") Integer readerId) {
        return borrowRecordService.getBorrowRecordByReaderId(readerId);
    }

    @PostMapping("/add")
    public int addBorrowRecord(@RequestBody BorrowRecord borrowRecord) {
        return borrowRecordService.addBorrowRecord(borrowRecord);
    }

    @PutMapping("/edit")
    public int editBorrowRecord(@RequestBody BorrowRecord borrowRecord) {
        return borrowRecordService.editBorrowRecord(borrowRecord);
    }

    @GetMapping("/delete/{recordId}")
    public boolean deleteBorrowRecord(@PathVariable("recordId") Integer recordId) {
        return borrowRecordService.deleteBorrowRecord(recordId);
    }
}