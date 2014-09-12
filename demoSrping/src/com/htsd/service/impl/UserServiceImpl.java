package com.htsd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htsd.dao.UserDao;
import com.htsd.model.User;
import com.htsd.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User loginCheck(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
