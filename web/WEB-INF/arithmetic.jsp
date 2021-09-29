<%-- 
    Document   : arithmetic
    Created on : 22-Sep-2021, 11:08:21 AM
    Author     : will
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            
            <label>First:</label>
            <input type="text" name="first" value="${first}">
            <br>
            <label>Second:</label>
            <input type="text" name="second" value="${second}">
            <br>
            <p>Result: ${result}</p>
            
            <input type="submit" value="+" name="math">
            <input type="submit" value="-" name="math">
            <input type="submit" value="*" name="math">
            <input type="submit" value="%" name="math">
               
        </form>
        <p>${message}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
