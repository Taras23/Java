<%--
  Created by IntelliJ IDEA.
  User: VIP
  Date: 30.05.2019
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="css/index.css" rel="stylesheet">
</head>
<body>
<h1>Authentication</h1>
<form action="\Login" method="post">
    <p>Enter email: <input type="text" name="user"></p>
    <p>Enter password: <input type="text" name="pass"></p>
    <input type="submit" value="Login User">
</form>
<a href="Registration.jsp"><button>Registration</button></a>

</body>
</html>
