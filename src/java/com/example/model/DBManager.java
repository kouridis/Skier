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
    
    public static boolean addUser(String username, String password, String email, String lfname) {
        try{
            String[] parts = lfname.split(" ");
            String lname = parts[0];
            String fname = parts[1];
            //loading drivers for mysql
            Class.forName(JDBC);

            //creating connection with the database 
            Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            PreparedStatement ps =conn.prepareStatement
                                ("insert into users (username, password, email, firstName, lastName) values(?,?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, fname);
            ps.setString(5, lname);
            
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
    
    public static boolean checkUTHUser(String username) {
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
    
    /*public static boolean isInfoCompleted(String username) {
        try{
            //loading drivers for mysql
            Class.forName(JDBC);

            //creating connection with the database 
            Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            
            PreparedStatement ps =conn.prepareStatement
                                ("select lastName, firstName from users where username=?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            String[] results = new String[2];
            results[0] = rs.getString("lastName"); 
            results[1] = rs.getString("firstName");
            //results[2] = rs.getString("gender");
            
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
    }*/
    
    public static String[][] getUser(String username) {
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
            
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            String[][] results = new String[columnCount][2];
            
            for (int i=1; i<=columnCount; i++) {
                results[i-1][0] = rsmd.getColumnName(i);
                results[i-1][1] = rs.getString(rsmd.getColumnName(i));
            }
            
            return results;
        }
        catch(Exception e) {
          e.printStackTrace();
          
          String[][] results = new String[1][1];
          results[0][0] = null;
          return results;
        }        
    }
    
    public static boolean updateUser(String[][] info) {
        try{
            int i,j = 1;
            boolean flag = false;
            //loading drivers for mysql
            Class.forName(JDBC);

            //creating connection with the database 
            Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            String query = "update users set ";
            for (i=1; i<=info.length-1; i++) {
                if(!info[i][1].equals("")) {
                    query = query + info[i][0] + " = ?, ";
                    flag = true;
                }
            }
            if (flag) {
                query = query.substring(0, query.length()-2);
                query = query + " where " + info[0][0] + " = ?";
                System.out.println(query);
                PreparedStatement ps =conn.prepareStatement(query);

                for(i=1; i<=info.length-1; i++) {
                    if (!info[i][1].equals("")) {
                        ps.setString(j++, info[i][1]);
                    }
                }
                ps.setString(j, info[0][1]);

                ps.executeUpdate();
            }
            return true;
        }
        catch(Exception e) {
          e.printStackTrace();

          return false;
        }        
    }

}
