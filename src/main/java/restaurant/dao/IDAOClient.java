package restaurant.dao;

public class IDAOClient {
	public interface IDAOClient extends JpaRepository<Client, Integer>{
		public List<Client> findAllByIdClienrt (Id, client);
		
	}

}
