<%-- 
    Document   : page2
    Created on : Jul 13, 2022, 2:53:33 PM
    Author     : Zahid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>this is page 2</h1>
        <%
            
            
            response.sendRedirect("newjsp.jsp");
        %>
    </body>
</html>
