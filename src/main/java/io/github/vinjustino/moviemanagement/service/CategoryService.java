package io.github.vinjustino.moviemanagement.service;

import io.github.vinjustino.moviemanagement.entity.Category;
import io.github.vinjustino.moviemanagement.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public Category create(Category category) {
        return categoryRepository.save(category);
    }
}