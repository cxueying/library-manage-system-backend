package com.group07.mapper;

import com.group07.entity.OperationRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OperationRecordMapper {
    List<OperationRecord> getAllOperationRecords();

    List<OperationRecord> getOperationRecordByAdminId(Integer adminId);

    int addOperationRecord(OperationRecord operationRecord);

    boolean deleteOperationRecord(Integer recordId);
}