package com.dao;

import com.entity.UserEntity;

import java.util.List;

/**
 * Created by Administrator on 2016/5/17.
 */
public interface IUserDAO {
    public List search(UserEntity condition);
}
