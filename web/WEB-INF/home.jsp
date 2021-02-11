<%-- 
    Document   : home
    Created on : Feb 8, 2021, 8:54:00 PM
    Author     : 843876
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
    </head>
    <body>
        <h1>Welcome Home</h1>
        <p> hello ${username}</p>
        <a href="Login?invalidate=true">Logout</a>
    </body>
</html>
