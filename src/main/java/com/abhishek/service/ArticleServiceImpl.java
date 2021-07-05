package com.abhishek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhishek.model.Article;
import com.abhishek.repository.ArticleRepository;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleRepository articleRepository;

	@Override
	public List<Article> getAllArticles() {
		return (List<Article>) articleRepository.findAll();

	}

	@Override
	public Article getArticleById(long id) {
		return articleRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Article article) {
		articleRepository.save(article);
	}

	@Override
	public void deleteArticle(long id) {
		articleRepository.deleteById(id);

	}

}
