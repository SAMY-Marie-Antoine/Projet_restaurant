package restaurant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restaurant.dao.IDAOProduit;
import restaurant.model.Produit;

@Service
public class ProduitService {

    @Autowired
	IDAOProduit daoProduit;
	
	public Produit getById(Integer id) 
	{
		Optional<Produit> opt = daoProduit.findById(id);
		if(opt.isEmpty()) 
		{
			return null;
		}
		else 
		{
			return (Produit) opt.get();
		}
	}

	public List<Produit> getAll()
	{
		return daoProduit.findAllProduit();
	}
	
	public Produit insert(Produit produit) 
	{
		
		return daoProduit.save(Produit);
	}
	
	public Produit update(Produit produit) 
	{
		if(Produit.getId()==null) 
		{
			throw new RuntimeException("Besoin d'un id pour faire une mise à jour.");
		}
		
		return daoProduit.save(Produit);
	}
	
	public void delete(Produit Produit) 
	{
		daoProduit.delete(Produit);
	}
	public void deleteById(Integer id) 
	{
		daoProduit.deleteById(id);
	}
		
	public List<Produit> findAllByType(TypeProduit type) {
		return daoProduit.findByType(type);
	}
}
