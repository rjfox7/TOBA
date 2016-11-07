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
import toba.data.Userdatabase;
import toba.user.User;

/**
 *
 * @author Rachel
 */
public class New_CustomerServlet extends HttpServlet {

    private Object user;

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
        
String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "Enroll";  // default action
        }
        // perform action and set URL to appropriate page
        if (action.equals("Enroll")) {
            url = "/TOBA/new_customer.jsp";    // the "join" page
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
            
        User user = new User(firstName, lastName, phone, address, city, state, zip, email);
        
        String message;
        if (firstName == null || lastName == null || phone == null || address == null || city == null || state == null || zip == null || email == null || firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || zip.isEmpty() || email.isEmpty()) {
            message = "Please complete all fields to enroll.";
            url = "/new_customer.jsp";          
        }
        else {
            message = "";
            url = "/success.html";
            Userdatabase.insert(user);
        }
        request.setAttribute("user", user);
        request.setAttribute("message", message);
    }
        // the "success" pagegetServletContext()
    getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
                    }
       }