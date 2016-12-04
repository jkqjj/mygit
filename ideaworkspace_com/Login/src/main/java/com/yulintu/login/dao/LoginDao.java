package com.yulintu.login.dao;

import com.yulintu.login.dao.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by qianjiajia on 2016/11/17.
 */
public class LoginDao {

    public boolean login(User user){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","jiajia");
            PreparedStatement ps = connection.prepareStatement("SELECT COUNT (*) FROM USER WHERE USERNAME=? AND PASSWORD=?");
            ps.setString(1,user.getUserName());
            ps.setString(2,user.getPassword());

            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()){
                int count = resultSet.getInt(1);
                if (count > 0){
                    return true;
                }else {
                    return false;
                }
            }



    }catch (ClassNotFoundException e){
            e.printStackTrace();
    }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
  }

  public int add(User user) {
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "jiajia");
          PreparedStatement ps = connection.prepareStatement("INSERT INTO USER (USERNAME,PASSWORD) VALUES (?,?)");
          ps.setString(1, user.getUserName());
          ps.setString(2, user.getPassword());

          int rows = ps.executeUpdate();
          return rows;


      }catch (ClassNotFoundException e){
          e.printStackTrace();
      }catch (SQLException e){
          e.printStackTrace();
      }
      return 0;
  }

  public List<User> list(){
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "jiajia");
          PreparedStatement ps = connection.prepareStatement("SELECT ID,USERNAME,PASSWORD FROM USER ");

          ResultSet rs = ps.executeQuery();
          List<User> userList = new ArrayList<User>();

          while (rs.next()){
              String username = rs.getString("username");
              String password = rs.getString("password");
              User user = new User(username,password);
              userList.add(user);
          }
          return userList;

      }catch (ClassNotFoundException e){
          e.printStackTrace();
      }catch (SQLException e){
          e.printStackTrace();
      }
      return null;
  }


}