<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 17, 2019, 2:25:15 PM
    Author     : 791105
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmeticcalculator" method="post">
            <p>First:<input type="text" name="first"></p>
            <p>Second:<input type="text" name="second"></p>
            <p>
                <input type = "submit" name="math"  value="+">
                <input type = "submit" name="math"  value="-">
                <input type = "submit" name="math" value="*">
                <input type = "submit" name="math" value="%">
            </p>
            <p>Result: ${result}</p>
            <a href="age">Age Calculator</a>
        </form>    
    </body>
</html>
