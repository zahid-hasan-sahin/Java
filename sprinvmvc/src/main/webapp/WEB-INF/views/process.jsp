<%-- 
    Document   : process
    Created on : Aug 14, 2022, 10:58:04 AM
    Author     : Zahid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>email: ${user.email}</h1>
        <h1>password ${user.password}</h1>
        <img src="<c:url value="/resources/images/${filename}"/>" />  
        <c:url value="/resources/images/${filename}"/>
    </body>
</html>
