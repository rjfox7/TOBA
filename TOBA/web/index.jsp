<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html>
       <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
        <div id="wrapper">
            

<c:import url="/includes/header.html" />
    
<h2>Welcome!</h2>
    
    <form action="/TOBA/login.jsp" method="get">
        <input type="submit" name="login" value="Log In">
        </form>
    <br>
    <form action="/TOBA/new_customer.jsp" method="get">
        <input type="submit" name="enroll" value="Enroll">
    </form>
    
    <h2>User Table</h2>
        <p><a href="userTableSpreadsheet">Return as an XLS file</a></p>
</div>
<main>
<h3>Banking for people on the go...</h3>
</main>
 </body>
 <c:import url="/includes/footer.jsp" />
</html>
