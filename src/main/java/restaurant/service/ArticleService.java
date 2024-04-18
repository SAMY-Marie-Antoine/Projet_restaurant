package restaurant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restaurant.dao.IDAOArticle;
import restaurant.model.Client;

@Service
public class ArticleService {

     @Autowired
	IDAOArticle daoArticle;
	
	public Article getById(Integer id) 
	{
		Optional<Article> opt = daoArticle.findById(id);
		if(opt.isEmpty()) 
		{
			return null;
		}
		else 
		{
			return (Article) opt.get();
		}
	}

	public List<Article> getAll()
	{
		return daoArticle.findAllArticle();
	}
	
	public Article insert(Article article) 
	{
		
		return daoArticle.save(article);
	}
	
	public Article update(Article article) 
	{
		if(Article.getId()==null) 
		{
			throw new RuntimeException("Besoin d'un id pour faire une mise à jour.");
		}
		
		return daoArticle.save(article);
	}
	
	public void delete(Article article) 
	{
		daoArticle.delete(article);
	}
	public void deleteById(Integer id) 
	{
		daoArticle.deleteById(id);
	}
		
}
