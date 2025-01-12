package com.group07.service;

import com.group07.entity.OperationRecord;

import java.util.List;

public interface IOperationRecordService {
    List<OperationRecord> getAllOperationRecords();

    List<OperationRecord> getOperationRecordByAdminId(Integer adminId);

    int addOperationRecord(OperationRecord operationRecord);

    boolean deleteOperationRecord(Integer recordId);
}