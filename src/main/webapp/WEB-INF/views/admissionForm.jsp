<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Spring - Student Application Form</h1>
	<form action="/SpringWebApplication/submitAdmissionForm.html" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="studentName"></td>
			</tr>
			<tr>
				<td>Hobby:</td>
				<td><input type="text" name="studentHobby"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>