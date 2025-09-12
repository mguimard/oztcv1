package io.java.world;

import java.util.Arrays;

import java.util.List;

import com.mycompany.user.Environment;
import com.mycompany.user.IUserService;
import com.mycompany.user.User;

@Environment("prod")
public class UserServiceB implements IUserService {
	@Override
	public List<User> loadUsers() {
		return Arrays.asList(new User("joe"), new User("jane"));
	}	
}
