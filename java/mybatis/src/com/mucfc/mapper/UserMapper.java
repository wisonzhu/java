package com.mucfc.mapper;

import com.mucfc.model.User;
public interface UserMapper {
	public User selectUserById(int userId);
	public void insertUser(User user);

}
