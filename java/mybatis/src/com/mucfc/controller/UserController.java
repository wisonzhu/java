package com.mucfc.controller;
import com.mucfc.model.User;
import  com.mucfc.mapper.UserMapper;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
	@RequestMapping(value="/findUser",method = RequestMethod.POST)
	public String getUser(){	

		return "findUser";
	}

	@RequestMapping("/add_user")
	public String adduser(){
		return "add_user";
	}

	@RequestMapping("/")
	public String getIndex(){

		return "index";
	}

	@RequestMapping(value = {"/addUser", ""}, method = RequestMethod.POST)
	public String insertUserPOST(User user)
	{
		userMapper.insertUser(user);
		return "redirect:/";
	}
}
