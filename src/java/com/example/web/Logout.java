package com.example.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import com.example.model.*;

public class Logout extends HttpServlet {
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("user");
        
        HttpSession session=request.getSession();  
        session.invalidate();
       
        response.sendRedirect(request.getParameter("from"));
    }
}