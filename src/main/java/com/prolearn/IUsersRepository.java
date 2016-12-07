package com.prolearn;

import java.util.List;

/**
 * 
 * @author bfattouh
 *
 */
public interface IUsersRepository {
	
	public List<User> getUsers();
	
	public User getUserById(Integer id);

}
