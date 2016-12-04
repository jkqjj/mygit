package com.yulintu.dao;

import com.yulintu.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created by qianjiajia on 2016/11/29.
 */
public class IUserDaoImp1 extends SqlSessionDaoSupport implements IUserDao {
    public User findUserById(String id) {

        return (User)this.getSqlSession().selectOne("com.yulintu.domain.User.selectUserById",id);
    }

    public List<User> findAllUser() {
        return this.getSqlSession().selectList("com.yulintu.domain.User.selectAllUser");
    }

    public List<User> findUserByCondition(User u) {
        return this.getSqlSession().selectList("com.yulintu.domain.User.selectUserByCondition",u);
    }

    public int deleteUserById(String id) {
        int i = this.getSqlSession().delete("com.yulintu.domain.User.deleteUserById",id);

        return i;
    }

    public int saveUser(User u) {
        int i = this.getSqlSession().insert("com.yulintu.domain.User.insertUser",u);
        return i;
    }

    public int updateUserById(User u) {
        int i = this.getSqlSession().update("com.yulintu.domain.User.updateUserById",u);
        return i;
    }

    public int updateUserByCondition(User u) {
        int i = this.getSqlSession().update("com.yulintu.domain.User.updateUserByCondition",u);
        return i;
    }
}
