package com.biz;

import com.dao.UserDAO;
import com.entity.UserEntity;

import java.util.List;
/**
 * Created by Administrator on 2016/5/17.
 */
public class UserBiz implements IUserBiz{
    UserDAO userDAO;
    public void setUserDAO(UserDAO userDAO)
    {
        this.userDAO = userDAO;
    }

    @Override
    public List login(UserEntity condition)
    {
        return userDAO.search(condition);
    }
}
