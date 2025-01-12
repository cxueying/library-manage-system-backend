package com.group07.controller;

import com.group07.entity.OperationRecord;
import com.group07.service.IOperationRecordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/operation-record")
public class OperationRecordController {
    @Resource
    private IOperationRecordService operationRecordService;

    @GetMapping("/all")
    public List<OperationRecord> getAllOperationRecords() {
        return operationRecordService.getAllOperationRecords();
    }

    @GetMapping("/by-admin/{adminId}")
    public List<OperationRecord> getOperationRecordByAdminId(@PathVariable("adminId") Integer adminId) {
        return operationRecordService.getOperationRecordByAdminId(adminId);
    }

    @PostMapping("/add")
    public int addOperationRecord(@RequestBody OperationRecord operationRecord) {
        return operationRecordService.addOperationRecord(operationRecord);
    }


    @GetMapping("/delete/{recordId}")
    public boolean deleteOperationRecord(@PathVariable("recordId") Integer recordId) {
        return operationRecordService.deleteOperationRecord(recordId);
    }
}