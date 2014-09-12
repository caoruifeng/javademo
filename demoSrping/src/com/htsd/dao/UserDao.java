package com.htsd.dao;

import com.htsd.model.User;

public interface UserDao {
	
	public boolean register(User user);
	
	public User findByusername(final String username);

}
