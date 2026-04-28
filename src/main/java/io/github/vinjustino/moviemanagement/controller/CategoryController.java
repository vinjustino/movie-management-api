package io.github.vinjustino.moviemanagement.controller;

import io.github.vinjustino.moviemanagement.entity.Category;
import io.github.vinjustino.moviemanagement.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public Category create(@RequestBody Category category) {
        return categoryService.create(category);
    }

    @GetMapping
    public List<Category> getALl() {
        return categoryService.findAll();
    }

    @PutMapping("/{id}")
    public Category getById(@PathVariable Long id){
        return categoryService.findById(id);
    }
}
