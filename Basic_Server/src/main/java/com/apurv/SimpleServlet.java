package com.apurv;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet")
public class SimpleServlet  extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out =response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>First Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Apurv Saxena</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }
}