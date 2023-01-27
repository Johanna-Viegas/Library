package com.example.Library.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    @OneToMany
    private List<Book> bookList;

}
