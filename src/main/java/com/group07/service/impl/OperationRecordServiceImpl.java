package com.group07.service.impl;

import com.group07.entity.OperationRecord;
import com.group07.mapper.OperationRecordMapper;
import com.group07.service.IOperationRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OperationRecordServiceImpl implements IOperationRecordService {
    @Resource
    private OperationRecordMapper operationRecordMapper;

    @Override
    public List<OperationRecord> getAllOperationRecords() {
        return operationRecordMapper.getAllOperationRecords();
    }

    @Override
    public List<OperationRecord> getOperationRecordByAdminId(Integer adminId) {
        return operationRecordMapper.getOperationRecordByAdminId(adminId);
    }

    @Override
    public int addOperationRecord(OperationRecord operationRecord) {
        return operationRecordMapper.addOperationRecord(operationRecord);
    }

    @Override
    public boolean deleteOperationRecord(Integer recordId) {
        return operationRecordMapper.deleteOperationRecord(recordId);
    }
}