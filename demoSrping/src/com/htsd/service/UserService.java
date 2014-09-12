package com.htsd.service;

import com.htsd.model.User;

public interface UserService {
	
	public boolean register(User user);
	
	public User loginCheck(User user);

}
