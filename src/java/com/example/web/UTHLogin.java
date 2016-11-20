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
import com.uthldap.Uthldap;

public class UTHLogin extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Uthldap ldap = new Uthldap(username,password);
        RequestDispatcher view = null;
        
        if(ldap.auth()){
            System.out.println("Autheticated Youre name is:" + ldap.getName());
            HttpSession session = request.getSession();
            session.setAttribute("user", username);
            response.sendRedirect(request.getParameter("from"));
        }
        else{
            System.out.println("Authetication failed");
            request.setAttribute("failure", "Login failed");
            request.setAttribute("fail", "1");
            view = request.getRequestDispatcher("UTHlogin.jsp");
            view.forward(request, response);
        }
    }
}
