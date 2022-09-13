<%-- 
    Document   : newjsp
    Created on : Jul 13, 2022, 8:17:17 AM
    Author     : Zahid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/newtag_library" prefix="t"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <t:myTag number="10" color="red"></t:myTag>
        <t:myTag number="10" color="green"></t:myTag>
        <a href="page1.jsp">go to</a>
      
    </body>
</html>
