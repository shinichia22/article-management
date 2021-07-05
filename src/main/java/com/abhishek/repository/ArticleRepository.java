package com.abhishek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
	
}
