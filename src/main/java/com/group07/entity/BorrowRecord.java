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
public class BorrowRecord {
    private Integer record_id;
    private Integer reader_id;
    private Integer book_id;
    private Date borrow_date;
    private Date return_date;
    private Date due_date;
    private String status;
}