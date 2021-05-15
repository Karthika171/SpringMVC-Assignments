<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Employee Management System</h1>


<form action="/newEmployee" method="post">

<p>Employee Name : <input name="empname" type="text" /> </p>
<p>Department : <input name="empdept" type="text" /></p>
<p>Designation :<input name="empdesignation" type="text"></p>
<p>Salary :<input name="empsalary" type="number"></p>
<input type="submit" value="register"/>



</form>
</body>
</html>