package com.fox.toba;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import toba.data.UserDB;
import toba.user.User;

/**
 *
 * @author Rachel
 */
public class LoginServlet extends HttpServlet {

    private User user;
    private boolean Reset_Password;

   
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        
String url = "/index.jsp";
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        
        User user = (User)request.getSession().getAttribute("user");
        if (user == null)
               url = "new_customer.jsp";
        else if(user.getuserName() == userName && user.getpassWord() == password)
        {
            url = "/account_activity.jsp";
        }
        if(userName!=null && userName.equalsIgnoreCase("") && password != null && password.equals(""))
        {
            //Redirect to login failure
            response.sendRedirect("/TOBA/login_failure.html");
        }   
        else if(Reset_Password);
        {
            //Redirect to login failure
            response.sendRedirect("/TOBA/password_reset.jsp");
       } 
        
 
//        
//        // forward request and response objects to specified URL
    getServletContext()
        .getRequestDispatcher(url)
        .forward(request, response);
    }    
    
    @Override
    protected void doGet(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        doPost(request, response);
    }    
}