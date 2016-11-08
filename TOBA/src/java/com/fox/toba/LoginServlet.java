package com.fox.toba;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import toba.data.Userdatabase;
import toba.user.User;

/**
 *
 * @author Rachel
 */
public class LoginServlet extends HttpServlet {

    private User user;

   
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        
String url = "/index.html";
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(userName!=null && userName.equalsIgnoreCase("jsmith@toba.com") && password != null && password.equals("letmein"))
        {
            //Redirect to successful login
            response.sendRedirect("/TOBA/account_activity.html");
        }
        else
        {
            //Redirect to login failure
            response.sendRedirect("/TOBA/login_failure.html");
            
       } 
        
    //        String action = request.getParameter("action");
//        if (action == null) {
//            action = "enroll";  // default action
//        }
//
//        // perform action and set URL to appropriate page
//        if (action.equals("enroll")) {
//            url = "/new_customer.html";    // the "join" page
//        }
//        else if (action.equals("add")) {                
//            // get parameters from the request
//            String userName = request.getParameter("userName");
//            String password = request.getParameter("password");
//            
//            // set User object in request object and set URL
//            request.setAttribute("user", User);
//            url = "/success.jsp";   // the "success" page
//        }
//        
//        // forward request and response objects to specified URL
//        getServletContext()
//            .getRequestDispatcher(url)
//            .forward(request, response);
    }    
    
    @Override
    protected void doGet(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        doPost(request, response);
    }    
}