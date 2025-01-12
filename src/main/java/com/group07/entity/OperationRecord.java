package com.group07.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OperationRecord {
    private Integer record_id;
    private Integer admin_id;
    private String operation_type;
    private Date operation_time;
    private String operation_content;
}