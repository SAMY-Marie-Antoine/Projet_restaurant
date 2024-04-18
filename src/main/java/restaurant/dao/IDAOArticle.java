package restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import restaurant.model.Article;

public interface IDAOArticle extends JpaRepository<Article,Integer>{

}
