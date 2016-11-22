<%-- 
    Document   : password_reset
    Created on : Nov 9, 2016, 11:07:11 PM
    Author     : Rachel
--%>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Password Reset</title>
             
    </head>
    <body>
        <div></div>
    
        <h1>Please select a new password for your account</h1>
        <form action="/Password_Reset">
        <label>=Enter New Password:</label>
        <input name="password" id="password" type="text" value="${user.password}">
        <span>${user.passWord}</span><br>
        <br><br>
        <input type="submit" value="Submit">
        </form>
        <br>
    </body>
</html>