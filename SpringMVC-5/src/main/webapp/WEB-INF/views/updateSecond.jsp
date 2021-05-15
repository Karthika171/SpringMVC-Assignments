<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
<h1>Employee Management System</h1>
<form:form action="/updateEmployee" modelAttribute="employee" method="post">
<p><label>Employee Id :</label> <form:hidden path="empid"/> </p>
<p><label>Employee Name :</label> <form:input path="empname"/> </p>
<p><label>Department : </label><form:input path="empdept" /></p>
<p><label>Designation :</label><form:input path="empdesignation"></form:input></p>
<p><label>Salary :</label><form:input path="empsalary"></form:input></p>
<input type="submit" value="update"/>
</form:form>


</body>
</html>