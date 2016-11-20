/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

import com.example.model.DBManager;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kourt
 */
public class Profile extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        String username = session.getAttribute("user").toString();
        String[][] results = DBManager.getUser(username);

        for (int i=2; i<=results.length-1; i++) {
            session.setAttribute(results[i][0], results[i][1]);
        }
        String[] parts = request.getQueryString().split("&");
        if (parts[parts.length-1].equals("act=Rent")) {
            RequestDispatcher view = request.getRequestDispatcher("profile.jsp");
            view.forward(request, response);
        }
        else  if(request.getRequestURI().equals("/Skier/Profile.do")) {
            RequestDispatcher view = request.getRequestDispatcher("profileupdate.jsp");
            view.forward(request, response);               
        }
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int i = 0;
        Enumeration paramNames = request.getParameterNames();
        while(paramNames.hasMoreElements()) {
            paramNames.nextElement();
            i++;
        }
        System.out.println(i);
        String[][] info = new String[i+1][2];
        i = 1;
        
        HttpSession session=request.getSession();
        info[0][0] = "username";
        info[0][1] = session.getAttribute("user").toString();
        
        paramNames = request.getParameterNames();
        while(paramNames.hasMoreElements()) {
            System.out.println(i);
            info[i][0] = (String)paramNames.nextElement();
            System.out.println(info[i][0]);
            info[i][1] = request.getParameter(info[i][0]);
            System.out.println(info[i][1]);
            i++;
        }
        
        if (DBManager.updateUser(info)) {
            RequestDispatcher view = request.getRequestDispatcher("profile.jsp");
            view.forward(request, response);
        }
        else {
            
        }
    }
}
