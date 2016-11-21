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
import com.example.model.DBManager;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.uthldap.Uthldap;

public class ActionResort extends HttpServlet {
    public void doGet( HttpServletRequest request, 
                      HttpServletResponse response) 
                      throws IOException, ServletException {

        String resort = request.getParameter("resort");
        if (resort.equals("default")) {
            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
        }
        
        String act = request.getParameter("act");

        if (act == null) {
            //no button has been selected
        } else if (act.equals("Rent")) {
            HttpSession session=request.getSession();
            if (session.getAttribute("user") == null) {
                RequestDispatcher view = request.getRequestDispatcher("login.jsp");
                view.forward(request, response);
            }
            else {
                /*
                if (!DBManager.isInfoCompleted(session.getAttribute("user").toString())) {
                    //sindedemenos user alla oxi simpliromena stoixeia
                    RequestDispatcher view = request.getRequestDispatcher("Profile.do");
                    view.forward(request, response);
                }*/
                String username = session.getAttribute("user").toString();
                String[][] results = DBManager.getUser(username);

                for (int i=2; i<=results.length-1; i++) {
                    session.setAttribute(results[i][0], results[i][1]);
                }
                
                RequestDispatcher view = request.getRequestDispatcher("rent.jsp");
                view.forward(request, response);
            }
        } else if (act.equals("Live")) {
            RequestDispatcher view = request.getRequestDispatcher("live.jsp");
            view.forward(request, response);
        } else if (act.equals("Select")) {
            RequestDispatcher view = request.getRequestDispatcher("resort.jsp");
            view.forward(request, response);
        } else {
        }
    }
}