/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

/**
 *
 * @author kouridis
 */

//import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Signup extends HttpServlet {      
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String id = "5";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/skierusers", "root", "%TasosKour1993");
            
            //Statement st = conn.createStatement();
            String insertQuery = "INSERT INTO users (id, username, email, password) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insertQuery);
            ps.setString(1,id);
            ps.setString(2,username);
            ps.setString(3,email);
            ps.setString(4,password);
            ps.executeUpdate();
 
        } catch (Exception e2) {
            System.out.println(e2);
        }
        RequestDispatcher view = null;
        view = request.getRequestDispatcher("index.html");
        view.forward(request, response);
        
    }
    
}