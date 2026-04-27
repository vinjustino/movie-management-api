package io.github.vinjustino.moviemanagement.repository;

import io.github.vinjustino.moviemanagement.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
