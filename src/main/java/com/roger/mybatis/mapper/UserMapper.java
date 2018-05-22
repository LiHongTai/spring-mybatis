package com.roger.mybatis.mapper;

import java.util.List;

import com.roger.mybatis.entity.User;

public interface UserMapper {
	
	void save(User user);
	void update(User user);
	void deleteById(int id);
	User findById(int id);
	List<User> findAll();
}
