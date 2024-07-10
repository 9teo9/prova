<%@ page language="java" contentType="text/html; charset=ISO-8859-1"		
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form action="<%= request.getContextPath()%>/urlServlet" method=post>
		<input type="text" name = "name">Nome<br>
		<input type="text" name = "cognome">Cognome<br>
		<input type="submit" name = "invia">
	</form>
</body>
</html>