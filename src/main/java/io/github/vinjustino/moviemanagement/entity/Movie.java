package io.github.vinjustino.moviemanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "movie")
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String title;

    private String description;

    @Column(name = "release_date", nullable = false)
    private LocalDate releaseDate;

    private double rating;
}