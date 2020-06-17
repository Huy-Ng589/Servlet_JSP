<%--
  Created by IntelliJ IDEA.
  User: huynqy
  Date: 17/06/2020
  Time: 08:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login by JSP</title>
</head>
<body>
    <form style="text-align: center" action="login" method="post">
        Username: <input type="text" value="" name="username">
        Password: <input type="password" value="" name="password">
        <br><br>
        Selection color<p>
        Color:
        <select name="color" size="1">
            <option value="Red">Red</option>
            <option value="Blue">Blue</option>
            <option value="Brown">Brown</option>
        </select>
        <br></br>
        <center>
            <input type="submit" value="Submit">
        </center>
    </form>
</body>
</html>
