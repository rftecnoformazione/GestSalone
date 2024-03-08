<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="effettualogin" method=post>

USERNAME<input type=text name=userCliente required>
PASSWORD<input type=text name=pswCliente required>

<input type=submit value=Login>
</form>

<h1>${messaggio}</h1>

</body>
</html>