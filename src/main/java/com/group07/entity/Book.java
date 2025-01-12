package com.group07.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data //getter setter
@AllArgsConstructor //有参构造
@NoArgsConstructor //无参构造
@ToString
public class Book {
    private String book_name;
    private String author;
    private String publish;
    private String ISBN;
    private String introduction;
    private String language;
    private BigDecimal price;
    private Date pub_date;
    private int class_id;
    private int count;
    private String location;
    private String img_url;
}
