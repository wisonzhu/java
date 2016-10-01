package com.mucfc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import  com.mucfc.mapper.UserMapper;
import com.mucfc.model.User;
@Component
public class UserDaoImpl implements UserDao{
    @Autowired
	private UserMapper userMapper;
	@Override
	public User findUserById(int id) {
		User user = userMapper.selectUserById(id);
		 return user; 
	}
	@Override
	public void addUser(User user) {
		userMapper.add(user);
	}

}
