<%-- 
    Document   : ageCalculator
    Created on : Sep 18, 2017, 8:36:03 AM
    Author     : 686623 Jethro Pineda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Next Birthday</title>
    </head>
    <body>
        <h1>Age next birthday</h1>
        <form action="AgeCalculator" method="post">
            Enter your current age: <input type="text" name="cAge" value="${currentage}"> 
            <input type="submit" value="Age next birthday">
        </form>
            ${nextBirthday}
            ${errorMessage}
            ${invalidMessage}
           
    </body>
</html>
