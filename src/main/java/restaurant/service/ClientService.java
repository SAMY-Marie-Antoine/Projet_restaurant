package restaurant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restaurant.model.Client;

@Service
public class ClientService {

     @Autowired
	IDAOClient daoClient;
	
	public Client getById(Integer id) 
	{
		Optional<Client> opt = daoClient.findById(id);
		if(opt.isEmpty()) 
		{
			return null;
		}
		else 
		{
			return (Client) opt.get();
		}
	}

	public List<Client> getAll()
	{
		return daoClient.findAllClient();
	}
	
	public Client insert(Client Client) 
	{
		
		return daoClient.save(Client);
	}
	
	public Client update(Client Client) 
	{
		if(Client.getId()==null) 
		{
			throw new RuntimeException("Besoin d'un id pour faire une mise à jour.");
		}
		
		return daoClient.save(Client);
	}
	
	public void delete(Client Client) 
	{
		daoClient.delete(Client);
	}
	public void deleteById(Integer id) 
	{
		daoClient.deleteById(id);
	}
		
}
