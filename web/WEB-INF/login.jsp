<%-- 
    Document   : login
    Created on : Feb 8, 2021, 8:53:45 PM
    Author     : 843876
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LoginPage</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post" action="Login">
            Username: <input type="text" name="username" value="${username}"><br>
            Password: <input type="text" name="password" value="${passworld}"><br>
            <input type="submit" value="Login">
        </form>
       ${message}
    </body>
</html>
