package com.cursor.libraryserver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, unique = true, length = 250)
    private String title;

    @Column(name = "rate", nullable = false)
    private double rate;

    @Column(name = "genre", nullable = false, unique = true, length = 100)
    private String genre;

    @Column(name = "description", nullable = false, unique = true, length = 250)
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;

}

