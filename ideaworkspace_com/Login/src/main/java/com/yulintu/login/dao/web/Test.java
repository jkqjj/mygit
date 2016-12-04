package com.yulintu.login.dao.web;

import com.yulintu.login.dao.domain.User;

import java.sql.*;

/**
 * Created by qianjiajia on 2016/11/17.
 */
public class Test {

    public User login(User user){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","jiajia");
            PreparedStatement ps = connection.prepareStatement("SELECT USERNAME ,PASSWORD FROM USER WHERE USERNAME=? AND PASSWORD=?");
            ps.setString(1,user.getUserName());
            ps.setString(2,user.getPassword());

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()){
                String username = resultSet.getString(1);
                String password = resultSet.getString(2);
                System.out.println("username" + username);
                System.out.println("password" + password);
            }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
