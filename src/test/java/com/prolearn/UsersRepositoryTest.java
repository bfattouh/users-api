package com.prolearn;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Before;
import org.junit.Test;


public class UsersRepositoryTest {
	
	private IUsersRepository usersRepository;
	
	@Before
	public void setup(){
		usersRepository = new UsersRepository();
	}
	
	@Test
	public void testGetUsers(){
		List<User> users = usersRepository.getUsers();
		assertNotNull(users);
		assertTrue(users.size() == 5);
	}

}
