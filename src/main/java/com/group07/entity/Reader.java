package com.group07.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Reader extends User{
    private Integer reader_id;
    private String name;
    private String sex;
    private Date birth;
    private String address;
}