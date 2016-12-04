package com.yulintu.service;

import com.yulintu.dao.IUserDao;
import com.yulintu.domain.User;

import java.util.List;

/**
 * Created by qianjiajia on 2016/11/29.
 */
public class UserServiceImp1 implements IUserService {

    private IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public User findUserById(String id) {
        return userDao.findUserById(id);
    }

    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    public List<User> findUserByCondition(User u) {
        return userDao.findUserByCondition(u);
    }

    public int deleteUserById(String id) {
        int i = userDao.deleteUserById(id);
        //int c = 1 / 0;
        return i;
    }

    public int saveUser(User u) {
        return userDao.saveUser(u);
    }

    public int updateUserById(User u) {
        return userDao.updateUserById(u);
    }

    public int updateUserByCondition(User u) {
        return userDao.updateUserByCondition(u);
    }
}
