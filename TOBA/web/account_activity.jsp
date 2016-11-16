<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Account_Activity</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <c:choose>
            <c:when test="${sessionScope.user != null}">
        <h2>Current account activity</h2>
        </c:when>
        <c:otherwise>
         <h2>Not logged in</h2>   
        </c:otherwise>
        </c:choose>
        
        
    </body>
</html>
