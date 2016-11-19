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

public class ActionResort extends HttpServlet {
    public void doPost( HttpServletRequest request, 
                      HttpServletResponse response) 
                      throws IOException, ServletException {

    String resort = request.getParameter("resort");
    
    String act = request.getParameter("act");
    
    if (act == null) {
        //no button has been selected
    } else if (act.equals("Rent")) {
        RequestDispatcher view = request.getRequestDispatcher("rent.jsp");
        view.forward(request, response);
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