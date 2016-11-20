/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

/**
 *
 * @author kourt
 */
import java.sql.*;

public class CreateAccount {
    public static boolean addUser(String id, String username, String email, String password) {
        try{
            //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database 
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/skierusers", "root", "%TasosKour1993");
            PreparedStatement ps =conn.prepareStatement
                                ("insert into users (id, username, email, password) values(?,?,?,?)");
            ps.setString(1,id);
            ps.setString(2,username);
            ps.setString(3,email);
            ps.setString(4,password);
            
            ps.executeUpdate();
            return true;
        }
        catch(Exception e) {
          e.printStackTrace();
          return false;
        }               
    }   
}
