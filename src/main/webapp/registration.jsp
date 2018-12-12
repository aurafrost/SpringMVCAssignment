<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration page:</h1><br>
<form action="register.html" method="post">
	ID: <input type="text" name="id"><br>
	Name: <input type="text" name="name"><br>
	Email: <input type="text" name="email"><br>
	Phone: <input type="text" name="phone"><br>
	Age: <input type="number" name="age"><br>
	Gender:
	<select name=gender>
		<option value=Male>Male</option>
		<option value=Female>Female</option>
	</select><br>
	Address: <input type="text" name="address"><br>
	<input type="submit" value="submit">
</form>
</body>
</html>