package com.bkav.servlet;

import com.bkav.models.Management;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Authentication extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String color = request.getParameter("color");
        PrintWriter out = response.getWriter();

        Management mn = new Management();
        if (mn.checkUser(username, password)) {
            out.println("Welcome " + username + " to the Website!!!");
            out.println("Color choice: " + color);
        } else
            out.println("Username or password incorrect.");

    }
}
