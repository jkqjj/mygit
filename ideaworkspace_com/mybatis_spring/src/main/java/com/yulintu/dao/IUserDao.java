package com.yulintu.dao;

import com.yulintu.domain.User;

import java.util.List;

/**
 * Created by qianjiajia on 2016/11/29.
 */
public interface IUserDao {

    public User findUserById(String id);
    public List<User> findAllUser();
    public List<User> findUserByCondition(User u);

    public int deleteUserById(String id);

    public int saveUser(User u);

    public int updateUserById(User u);

    public int updateUserByCondition(User u);

}
