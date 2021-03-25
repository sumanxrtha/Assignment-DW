package com.example.AssignmentSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try{
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();

            String sname = request.getParameter("name");
            String spasswd = request.getParameter("passwd");

            //Starting a session
            HttpSession session = request.getSession();
            //session limit 30sec.
            session.setMaxInactiveInterval(30);

            pw.println("welcome "+ sname);

            //checking password and using RequestDispatcher
            if (spasswd.equals("java")){
                RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
                rd.forward(request, response);
            }
            else{
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                pw.println("your password is incorrect, thank you");
                rd.include(request, response);
            }
            pw.close();


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
