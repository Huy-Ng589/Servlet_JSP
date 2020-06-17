package com.bkav.servlet;

import com.bkav.models.BearExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class BearSelect extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = request.getParameter("color");
        BearExpert be = new BearExpert();

        ArrayList results = be.getBranch(str);

//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out .println("Bear selection advice </br>");

        request.setAttribute("style", results);
        RequestDispatcher view = request.getRequestDispatcher("results.jsp");
        view.forward(request, response);

//        Iterator it = results.iterator();
//        while (it.hasNext()) {
//            out.println("<br> try: " + it.next());
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
