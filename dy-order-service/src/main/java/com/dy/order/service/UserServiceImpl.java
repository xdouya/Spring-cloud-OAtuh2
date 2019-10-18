package com.dy.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dy.order.dao.UserDao;
import com.dy.order.entiy.User;

@Service
public class UserServiceImpl implements UserService {

	private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public void create(String username, String password, String rolenname) {
		User user = new User();
		password = "{bcrypt}" + passwordEncoder.encode(password);
		user.setUsername(username);
		user.setPassword(password);
		userDao.createUser(user);
		userDao.createUserRole(username, rolenname);
	}

}
