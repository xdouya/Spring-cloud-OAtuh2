package com.dy.order.dao;

import org.apache.ibatis.annotations.Param;

import com.dy.order.entiy.User;

public interface UserDao {

	void createUser(User user);	
	void createUserRole(@Param("username") String username, @Param("rolename")String rolename);

}
