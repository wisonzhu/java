package com.mucfc.dao;

import com.mucfc.model.User;
/**
 * DAO�ӿڲ�
 * @author linbingwen
 * @time 2015.5.15
 */
public interface UserDao {

	public User findUserById(int id);
	public void addUser(User user);
}
