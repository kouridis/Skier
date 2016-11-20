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

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCountListener implements HttpSessionListener {
    private static int totalActiveSessions;
    
    public void sessionCreated(HttpSessionEvent event) {
        totalActiveSessions++;
        System.out.println("A new session is created. Number of sessions " + totalActiveSessions);
    }
 
    public void sessionDestroyed(HttpSessionEvent event) {
        totalActiveSessions--;
        System.out.println("session is destroyed. Number of sessions " + totalActiveSessions);
    }
}
