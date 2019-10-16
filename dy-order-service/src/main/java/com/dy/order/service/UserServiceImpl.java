package com.dy.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dy.order.dao.UserDao;
import com.dy.order.entiy.User;

@Service
public class UserServiceImpl implements UserService {

	private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Autowired
	private UserDao userDao;

	@Override
	public void create(String username, String password) {
		User user = new User();
		user.setUsername(username);
		password = "{bcrypt}" + passwordEncoder.encode(password);
		user.setPassword(password);
		userDao.save(user);
	}

}
