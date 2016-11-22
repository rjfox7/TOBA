<%@ page import ="java.util.GregorianCalendar, java.util.Calendar" %>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int CurrentYEar = currentDate.get(Calendar.YEAR);
%>
<%-- 
    Document   : footer
    Created on : Nov 7, 2016, 4:34:16 PM
    Author     : Rachel
--%>

<p>&copy; Copyright <%= currentYear %> TOBA Titan</p>
