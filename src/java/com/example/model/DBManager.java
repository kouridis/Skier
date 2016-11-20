/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.sql.*;


/**
 *
 * @author kourt
 */
public class DBManager {
    private static String JDBC = "com.mysql.jdbc.Driver";
    private static String DBURL = "jdbc:mysql://localhost:3306/skierusers";
    private static String DBUSER = "root";
    private static String DBPASS = "%TasosKour1993";
    
    public static boolean addUser(String username, String email, String password) {
        try{
            //loading drivers for mysql
            Class.forName(JDBC);

            //creating connection with the database 
            Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            PreparedStatement ps =conn.prepareStatement
                                ("insert into users (username, email, password) values(?,?,?)");
            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, password);
            
            ps.executeUpdate();
            return true;
        }
        catch(Exception e) {
          e.printStackTrace();
          return false;
        }               
    }
    
    public static boolean addUTHUser(String username, String email, String lfname) {
        try{
            String[] parts = lfname.split(" ");
            String lname = parts[0];
            String fname = parts[1];
            
            //loading drivers for mysql
            Class.forName(JDBC);

            //creating connection with the database 
            Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            PreparedStatement ps =conn.prepareStatement
                                ("insert into users (username, email, firstName, lastName) values(?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, fname);
            ps.setString(4, lname);
            
            ps.executeUpdate();
            return true;
        }
        catch(Exception e) {
          e.printStackTrace();
          return false;
        }               
    }
    
    public static boolean authUser(String username, String password) {      
        try{
            //loading drivers for mysql
            Class.forName(JDBC);

            //creating connection with the database 
            Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            
            PreparedStatement ps =conn.prepareStatement
                                ("select * from users where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            return rs.next();
        }
        catch(Exception e) {
          e.printStackTrace();
          return false;
        }        
    }
    
    public static boolean checkUser(String username) {
        try{
            //loading drivers for mysql
            Class.forName(JDBC);

            //creating connection with the database 
            Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            
            PreparedStatement ps =conn.prepareStatement
                                ("select * from users where username=?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            return rs.next();
        }
        catch(Exception e) {
          e.printStackTrace();
          return false;
        }        
    }
    
    public static boolean infoComplete(String username) {
        try{
            //loading drivers for mysql
            Class.forName(JDBC);

            //creating connection with the database 
            Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            
            PreparedStatement ps =conn.prepareStatement
                                ("select lastName, firstName, gender from users where username=?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            String[] results = new String[3];
            results[0] = rs.getString("lastName"); 
            results[1] = rs.getString("firstName");
            results[2] = rs.getString("gender");
            
            for (int i=0; i<=results.length-1; i++) {
                if (results[i] == null) {
                    return false;
                }
            }

            return true;
        }
        catch(Exception e) {
          e.printStackTrace();
          return false;
        }        
    }
    
    public static String[] getUser(String username) {
        try{
            //loading drivers for mysql
            Class.forName(JDBC);

            //creating connection with the database 
            Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            
            PreparedStatement ps =conn.prepareStatement
                                ("select * from users where username=?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            Array a = rs.getArray("is_nullable");
            String[] results = (String[])a.getArray();
            
            return results;
        }
        catch(Exception e) {
          e.printStackTrace();
          
          String[] results = new String[1];
          results[0] = null;
          return results;
        }        
    }

}
