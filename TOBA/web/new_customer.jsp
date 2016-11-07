<%-- 
    Document   : new_customer
    Created on : Oct 25, 2016, 9:44:34 PM
    Author     : Rachel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
        <meta charset="UTF-8">
        <title>New_Customer</title>
    
    <body>
    <h2>All fields must be completed to enroll</h2>
    <p><i>${message}<i><p>
        <form action="New_Customer" method="post">
        <input type="hidden" name="action" value="add">        
        <label class="pad_top">First Name:</label>
        <br>
        <input type="text" name="firstName" ><br>
        <label class="pad_top">Last Name:</label>
        <br>
        <input type="text" name="lastName" ><br>
        <label class="pad_top">Phone:</label>
        <br>
        <input type="text" name="phone" ><br>
        <label class="pad_top">Address:</label>
        <br>
        <input type="text" name="address" ><br>
        <label class="pad_top">City:</label>
        <br>
        <input type="text" name="city" ><br>
        <label class="pad_top">State:</label>
        <br>
        <input type="text" name="state" ><br>
        <label class="pad_top">Zip:</label>
        <br>
        <input type="text" name="zip" ><br>
        <label class="pad_top">Email:</label>
        <br>
        <input type="email" name="email" ><br>
        <label>&nbsp;</label>
        <br>
        <input type="submit" value="Enroll" class="margin_left">
    </form>
</body>
</html>