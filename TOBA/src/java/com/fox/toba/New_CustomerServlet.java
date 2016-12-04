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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Base64;
import toba.data.UserDB;

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
    
    public static String hashPassword(String password)
            throws NoSuchAlgorithmException {        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.reset();
        md.update(password.getBytes());
        byte[] mdArray = md.digest();
        StringBuilder sb = new StringBuilder(mdArray.length * 2);
        for (byte b : mdArray) {
            int v = b & 0xff;
            if (v < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(v));
        }        
        return sb.toString();        
    }
    
    public static String getSalt() {
        Random r = new SecureRandom();
        byte[] saltBytes = new byte[32];
        r.nextBytes(saltBytes);
        return Base64.getEncoder().encodeToString(saltBytes);
    }
    
    public static String hashAndSaltPassword(String password)
            throws NoSuchAlgorithmException {
        String salt = getSalt();
        return hashPassword(password + salt);
    }
    
    public static void checkPasswordStrength(String password) throws Exception {
        if (password == null || password.trim().isEmpty()) {
            throw new Exception("Password cannot be empty.");
        } else if (password.length() < 8) {
            throw new Exception("Password is to short. " +
                    "Must be at least 8 characters long.");
        }
    }

    public static boolean validatePassword(String password) {
        try {
            checkPasswordStrength(password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    /*  This code tests the functionality of this class.
    */    
    public static void main(String[] args) {
        try {
            System.out.println("Hash for 'sesame':\n"
                    + hashPassword("sesame"));
            System.out.println("Random salt:\n"
                    + getSalt());
            System.out.println("Salted hash for 'sesame':\n"
                    + hashAndSaltPassword("sesame"));            
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }
        
        try {
            checkPasswordStrength("sesame1776");
            System.out.println("Password is valid.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
   
    
    }

    static class UserDB {

        private static void insert() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public UserDB() {
        }
    }
       }