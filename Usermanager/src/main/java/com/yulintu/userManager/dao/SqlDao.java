package com.yulintu.userManager.dao;

import com.yulintu.userManager.domain.User;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by jiajiaQian on 2016/11/21.
 */
public class SqlDao {

        String DBDRIVER = "com.mysql.jdbc.Driver";
        Connection con = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        public SqlDao(){
            try{
                Class.forName(DBDRIVER);
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?useUnicode=true&characterEncoding=UTF-8", "root", "jiajia");
            }catch (SQLException e){
                e.printStackTrace();
            }
        }


        /**
         * 插入一条新的记录
         * @return
         */
        public int getInsert(String sql,User user){
        int count = 0;
        try{
            pre = con.prepareStatement(sql);
            pre.setString(1,user.getUsername());
            pre.setString(2,user.getPassword());
            pre.setString(3,user.getUserSex());

            count = pre.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                pre.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return count;
    }

    /**
     * 删除一条记录
     */
    public int getDelete(String sql ,int id){
        int count = 0;
        try{
            pre = con.prepareStatement(sql);
            pre.setInt(1,id);
            count = pre.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                pre.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return count;
    }

    /**
     * 根据用户ID查询某一条记录
     */
    public User getSearchById(String sql,int id){
        User user = new User();
        try {
            pre = con.prepareStatement(sql);
            pre.setInt(1,id);
            rs = pre.executeQuery();
            while (rs.next()){
                user.setUserId(rs.getInt("userId"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setUserSex(rs.getString("userSex"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }

    /**
     * 更新某一条记录
     */
    public int getUpdate(String sql,User user){
        int count = 0;
        try {
            pre = con.prepareStatement(sql);
            pre.setInt(4,user.getUserId());
            pre.setString(1,user.getUsername());
            pre.setString(2,user.getPassword());
            pre.setString(3,user.getUserSex());
            count = pre.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                pre.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return count;
    }

    /**
     * 显示所有记录
     */
    public ArrayList<User> getSearch(String sql){
        ArrayList<User> list = new ArrayList<User>();
        try {
            pre = con.prepareStatement(sql);
            rs = pre.executeQuery();
            while (rs.next()){
                User user = new User();
                user.setUserId(rs.getInt("userId"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setUserSex(rs.getString("userSex"));
                list.add(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                pre.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return list;
    }

}
