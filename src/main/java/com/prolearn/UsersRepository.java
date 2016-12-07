package com.prolearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 
 * @author bfattouh
 *
 */
public class UsersRepository implements IUsersRepository {
	
    private Map<Integer, User> users = new HashMap<Integer, User>();
    
    
    public UsersRepository(){
    	System.out.println("Loaded users data repository for testing...");
    	Address address1 = new Address("100 Kevin Street", "Apt. 556", "Montreal", "QC", "H3E2E5", "CA");
    	Address address2 = new Address("120 Firt Street", "Apt. 12", "Montreal", "QC", "H3R4E6", "CA");
    	Address address3 = new Address("200 Atlanta Street", "Apt. 552", "Atlanta", "GA","H3E2E5", "US");
    	Address address4 = new Address("10 bernando street", "Apt. 111", "Los Angeles", "CA","12345", "US");
    	Address address5 = new Address("100 Ontario Street", "Apt. 230", "Ottawa", "ON", "H3E2E5", "CA");
    	this.users.put(1, new User(1, "Bouchaib Fattouh", "testuser", "fattouh@prolearn.com", address1, "1-514-736-8031 x56442", "prolearn.com"));
    	this.users.put(2, new User(2, "Paul Ninz", "pnintz", "pnintz@prolearn.com", address2, "1-514-736-1111 x564", "prolearn.com"));
    	this.users.put(3, new User(3, "Franck Garnau", "franau", "franck@prolearn.com", address3, "1-408-736-8033 x564", "prolearn1.com"));
    	this.users.put(4, new User(4, "Louis Fernandez", "lfernand", "luisf@prolearn.com", address4, "1-401-736-8030 x56442", "prolearn.com"));
    	this.users.put(5, new User(5, "Riz leonord", "lriz", "rleon@prolearn.com", address5, "1-401-736-8020 x56420", "prolearn.com"));
    }

	@Override
	public List<User> getUsers() {
		return new ArrayList<>(users.values());
	}

	@Override
	public User getUserById(Integer id) {
		return users.get(id);
	}

}
