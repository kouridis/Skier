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

public class Validate {
    public static boolean checkUser(String username,String password) {
        boolean st =false;
        
        try{
            //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database 
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/skierusers", "root", "%TasosKour1993");
            PreparedStatement ps =conn.prepareStatement
                                ("select * from users where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            st = rs.next();
        }
        catch(Exception e) {
          e.printStackTrace();
        }
        
        return st;                 
    }   
}
