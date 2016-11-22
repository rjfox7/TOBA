/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.user;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String userName;
    private String passWord;

    public User() {
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        city = "";
        state = "";
        zip = "";
        email = "";
        userName = "";
        passWord = "";
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param phone
     * @param address
     * @param city
     * @param state
     * @param email
     */
    public User(String firstName, String lastName, String phone, String address, String city, String state, String zip, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
            }

    public User(String firstName, String lastName, String phone, String address, String city, String state, String zip, String email, String userName, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.userName = userName;
        this.passWord = passWord;
    }

    public User(String firstName, String lastName, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
        
    }
    public String getaddress() {
        return address;
    }
    public void setaddress(String address) {
        this.address = address;
        
    }
    
    public String getcity() {
        return city;
    }
    public void setcity(String city) {
        this.city = city;
        
    }
    
    public String getstate() {
        return state;
    }
    public void setstate(String state) {
        this.state = state;
        
    }
    
    public String getzip() {
        return zip;
    }
    public void setzip(String zip) {
        this.zip = zip;
        
    }
    public String getemail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
       public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.email = userName;
    }

    public String getpassWord() {
        return passWord;
    }

    public void setpassWord(String passWord) {
        this.email = passWord;
    }

    public String getfirstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getlastName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
