package com.example.blog.springbootdeveloper.repository;

import com.example.blog.springbootdeveloper.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
