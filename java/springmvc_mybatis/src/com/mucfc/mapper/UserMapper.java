package com.mucfc.mapper;

import com.mucfc.model.User;
import org.apache.ibatis.annotations.Insert;

public interface UserMapper {
	public User selectUserById(int userId);

	@Insert("insert into t_user(userId, userName, userAge ) values(#{userId}, #{userName},#{userAge});")
	public void add(User user);

}
