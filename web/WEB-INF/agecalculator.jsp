<%-- 
    Document   : agecalculator
    Created on : Sep 13, 2019, 3:51:11 PM
    Author     : 791105
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            <p>Enter your age:<input type="text" name="age" 
                 ></p>
            <p><input type="submit" value="Age next birthday"></p>
            <p>${message}${age}</p>
            <p><a href="arithmeticcalculator">Arithmetic Calculator</a></p>
        </form>
    </body>
</html>
