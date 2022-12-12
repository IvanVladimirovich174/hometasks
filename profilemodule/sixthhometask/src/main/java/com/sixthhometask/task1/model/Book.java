package com.sixthhometask.task1.model;

import lombok.Data;

import java.util.Date;

@Data
public class Book {
    private Long id;
    private String title;
    private String author;
    private Date dateAdded;
}