package com.yulintu.userManager.dao;

import com.yulintu.userManager.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiajiaQian on 2016/11/17.
 */
public class RegisterDao {

    public boolean login(User user){
        try {
            //加载myql的驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取数据库连接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "jiajia");
            PreparedStatement ps = connection.prepareStatement(" SELECT COUNT(*) FROM usermanager WHERE   username=? AND password=? AND sex=?");

            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getUserSex());

            ResultSet resultSet = ps.executeQuery();
            if(resultSet.next()){
                int count = resultSet.getInt(1);
                if(count > 0){
                    return true;
                }else {
                    return false;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    public int add(User user) {
        try {
            //加载myql的驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取数据库连接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "jiajia");
            PreparedStatement ps = connection.prepareStatement("INSERT  INTO usermanager(USERNAME,PASSWORD,SEX)VALUES(?,?,?)");

            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getUserSex());

            int rows = ps.executeUpdate();
            return rows;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

//    public List<User> list() {
//        try {
//            //加载myql的驱动
//            Class.forName("com.mysql.jdbc.Driver");
//            //获取数据库连接
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "jiajia");
//            PreparedStatement ps = connection.prepareStatement("SELECT ID,PASSWORD ,USERNAME FROM myuser");
//            ResultSet rs = ps.executeQuery();
//            List<User> userList = new ArrayList<User>();
//            while (rs.next()){
//
//                String password = rs.getString("password");
//                String username = rs.getString("username");
//                User user = new User(password,username);
//                userList.add(user);
//            }
//            return userList;
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }




    public List<User> findAll() {
        List<User> userList = new ArrayList<User>();
        try {
            //加载myql的驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取数据库连接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "jiajia");
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM usermanager");
            ResultSet rs = ps.executeQuery();

            while (rs != null && rs.next()) {
                User users = new User();
                users.setUserId(rs.getInt("id"));
                users.setUsername(rs.getString("username"));
                users.setPassword(rs.getString("password"));
                users.setUserSex(rs.getString("sex"));

                userList.add(users);
            }
            return userList;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
