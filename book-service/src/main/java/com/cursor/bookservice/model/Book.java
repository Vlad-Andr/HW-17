package com.cursor.bookservice.model;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String title;
    private double rate;
    private String genre;
    private String description;
}

