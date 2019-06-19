<%--
  Created by IntelliJ IDEA.
  User: VIP
  Date: 03.06.2019
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Registration</h1>
<form action="Login" method="post">
    <p>Enter email: <input type="text" name="user"></p>
    <p>Enter password: <input type="text" name="pass"></p>
    <p>Enter password again: <input type="text" name="pass1"></p>
    <input type="submit" value="Create User">
</form>
<a href="index.jsp"><button>LogIn Page</button></a>
</body>
</html>
