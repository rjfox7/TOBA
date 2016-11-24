/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fox.toba;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import toba.data.Userdatabase;
import toba.user.User;

/**
 *
 * @author Rachel
 */
public class New_CustomerServlet extends HttpServlet {

    private HttpSession session;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        session=request.getSession(true);       
        String url = "/index.jsp";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "Enroll";  // default action
        }
        // perform action and set URL to appropriate page
        if (action.equals("Enroll")) {
            url = "/TOBA/new_customer.jsp"; 
            // the "join" page
        }
        else if (action.equals("add")) {                
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");
            String email = request.getParameter("email");
            String userName = request.getParameter("userName");
            String passWord = request.getParameter("passWord");
            
                   
        String message;
        if (userName == null || "".equals(userName)){
            userName = String.format("%1$s%2$s", lastName,zip);
        }
        if (passWord == null || "".equals(passWord)){
            passWord = "welcome1";
        }
        if (firstName != null && lastName != null && phone != null && address != null && city != null && state != null && zip != null && email != null && !firstName.isEmpty() && !lastName.isEmpty() && !phone.isEmpty() && !address.isEmpty() && !city.isEmpty() && !state.isEmpty() && !zip.isEmpty() && !email.isEmpty() && !userName.isEmpty() && !passWord.isEmpty()) {
            message = "";
            url = "/success.jsp";
            
             User user = new User(firstName, lastName, phone, address, city, state, zip, email, userName, passWord);
            session.setAttribute("user", user); 
            
            UserDB.insert(//<editor-fold defaultstate="collapsed" desc="comment">
                    /*User*/
//</editor-fold>
);     
                                   
           
        }
        else {
            message = "Please complete all fields to enroll.";
            url = "/new_customer.jsp";
                        
        }
        session.setAttribute("userName", userName);
        session.setAttribute("passWord", passWord);
        session.setAttribute("message", message);
    }
        // the "success" pagegetServletContext()
    getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
                    }

    private static class UserDB {

        private static void insert() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public UserDB() {
        }
    }

    private static class user {

        public user() {
        }
    }
       }