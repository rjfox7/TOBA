<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
             
    </head>
    <body>
        <div></div>
   
    <h1>Please Log In</h1>
    <p>Enter your username and password below</p>
    <form action="Login" method="post">
        <label class="pad_top">User Name:</label>
        <input type="text" name="username" required><br>
        <label class="pad_top">Password:</label>
        <input type="text" name="password"><br>
         <br><br>
        <input type="submit" value="Submit">
        <input type="submit" name="Reset Password" value="Reset Password">
    </form>
    </body>
</html>
