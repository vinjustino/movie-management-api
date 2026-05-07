package io.github.vinjustino.moviemanagement.service;

import io.github.vinjustino.moviemanagement.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;
}
