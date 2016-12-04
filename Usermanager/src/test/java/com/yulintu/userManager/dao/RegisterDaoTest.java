package com.yulintu.userManager.dao;

import com.yulintu.userManager.domain.User;
import org.junit.Test;

import java.util.List;

/**
 * Created by jiajiaQian on 2016/11/18.
 */
public class RegisterDaoTest {

    RegisterDao loginDao = new RegisterDao();

    @Test
    public void login() throws Exception {
        User user = new User("jiajia","123456","女");
        loginDao.login(user);
    }

    @Test
    public void add() throws Exception {
        User user = new User("haha","admin","boy");
        int rows = loginDao.add(user);
        if(rows > 0){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }
    }

    @Test
    public void findAll() throws Exception {
        List<User> userList = loginDao.findAll();
        System.out.println(userList);
    }

}