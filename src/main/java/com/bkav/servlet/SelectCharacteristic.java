package com.bkav.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SelectCharacteristic extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
//        String one = request.getParameterValues("size")[0];
        String [] size = request.getParameterValues("size");

        for (int i = 0; i < size.length; i++) {
            out.println("Size: " + size[i] + ".");
        }
    }
}
