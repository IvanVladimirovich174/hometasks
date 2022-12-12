package com.sixthhometask.task1.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String name;
    private String surname;
    private Date birthDate;
    private String telephoneNumber;
    private String email;
    private String booksTitles;
}