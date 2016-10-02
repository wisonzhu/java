package com.mucfc.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import  com.mucfc.mapper.UserMapper;
import com.mucfc.model.User;
@Component
public class UserDaoImpl implements UserDao {
	//private  SqlSessionFactory sessionFactory;
	//private  SqlSession session;
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserById(int id) {
		User user = userMapper.selectUserById(id);
		return user;
	}
	//@Override
	//public String addUser(User user) {
	//	userMapper.insertUser(user);
	//	return "index";
	//}
}
