<%-- 
    Document   : age calc
    Created on : 22-Sep-2021, 11:08:21 AM
    Author     : will
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
        <form method="POST" action="age">
            
            <label>Enter your age</label>
            <input type="text" name="age" value="${age}">
            <br>
            <input type="submit" value="Age next birthday">
               
        </form>
        <p>${message}</p>
        <a href="WEB-INF/arithmeticcalculator.java">Arithmetic Calculator</a>
    </body>
</html>
