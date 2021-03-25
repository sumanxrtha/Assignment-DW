package com.example.AssignmentSessionNew;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Welcome", value = "/Welcome")
public class Welcome extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String wname = request.getParameter("name");
        String wpasswd = request.getParameter("passwd");

        HttpSession session = request.getSession();
        session.setAttribute("sname", wname);


        if(wpasswd.equals("as")){

            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
            rd.forward(request, response);
            pw.print("welcome "+ wname);
//            response.sendRedirect("welcome.jsp");

        }else{
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.include(request, response);
//            response.sendRedirect("index.jsp");
            pw.print("incorrect password");
        }


    }

}
