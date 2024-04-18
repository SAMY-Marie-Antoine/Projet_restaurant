package restaurant.dao;

public interface IDAOCommande extends JpaRepository<Commande, Integer>{
    
	public List<Commande> findByClient(Client client);
		
}
