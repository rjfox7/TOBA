<%-- 
    Document   : footer
    Created on : Nov 7, 2016, 4:34:16 PM
    Author     : Rachel
--%>

<%@ page import="java.util.Calendar.YEAR"%>
<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar,YEAR);
    %>
  <p>&copy; Copyright <%= currentYear %> TOBA Titan</p>
</body>
</html>
