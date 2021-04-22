<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee registration form</h1>

<form action="register.do" method="post">
<pre>
Name<input type="text" name="name">
EmailID<input type="email" name="mail">
Password<input type="password" name="password">
Confirm Password<input type="password" name="cpassword">
<input type="submit" value="Register">
</pre>
</form>


</body>
</html>