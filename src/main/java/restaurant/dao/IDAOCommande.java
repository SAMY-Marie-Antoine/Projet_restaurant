package restaurant.dao;

public class IDAOCommande {
	public interface IDAOCommande extends JpaRepository<Commande, Integer>{
      public List<Commande> findAllBy type (type Commande type);
		
	}

}
