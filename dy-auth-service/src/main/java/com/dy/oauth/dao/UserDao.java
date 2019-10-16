package com.dy.oauth.dao;

import com.dy.oauth.entiy.User;

public interface UserDao {
	User loadUserByUsername(String username);
}
