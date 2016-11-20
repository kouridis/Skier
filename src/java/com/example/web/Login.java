package com.example.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import com.example.model.*;

public class Login extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(DBManager.authUser(username, password))
        {
            HttpSession session = request.getSession();
            session.setAttribute("user", username);
            response.sendRedirect(request.getParameter("from"));
        }
        else
        {
           System.out.println("Username or Password incorrect");
           RequestDispatcher view = request.getRequestDispatcher("login.jsp");
           view.forward(request, response);
        }
    }  
}