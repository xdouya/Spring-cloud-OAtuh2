package com.dy.order.dao;

import com.dy.order.entiy.User;

public interface UserDao {

	void save(User user);

	User findByUsername(String username);

}
