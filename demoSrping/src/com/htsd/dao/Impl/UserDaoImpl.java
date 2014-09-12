package com.htsd.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.htsd.dao.UserDao;
import com.htsd.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public User findByusername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
