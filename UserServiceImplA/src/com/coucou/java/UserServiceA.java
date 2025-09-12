package com.coucou.java;

import java.util.Arrays;
import java.util.List;

import com.mycompany.user.Environment;
import com.mycompany.user.IUserService;
import com.mycompany.user.User;

@Environment("dev")
public class UserServiceA implements IUserService{	
	@Override
	public List<User> loadUsers() {	
		return Arrays.asList(new User("alice"), new User("bob"));
	}
}
