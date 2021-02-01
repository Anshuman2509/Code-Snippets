<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href='<c:url value="/resources/css/emp.css"/>' rel="stylesheet">
</head>
<body>
<div class="container">
<form:form action="save" modelAttribute="emp1" method="POST">
<table>
<tr>
<td><form:label path="id">Employee Id</form:label></td>
<td><form:input path="id"/></td>
<td><form:errors path="id" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="firstName">Employee First Name</form:label></td>
<td><form:input path="firstName" type="text"/></td>
<td><form:errors path="firstName" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="lastName">Employee Last Name</form:label></td>
<td><form:input path="lastName" type="text"/></td>
<td><form:errors path="lastName" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="age">Employee Age</form:label></td>
<td><form:input path="age" type="text"/></td>
<td><form:errors path="age" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="address.city">Employee City</form:label></td>
<td><form:input path="address.city" type="text"/></td>
<td><form:errors path="address.city" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="address.country">Employee Country</form:label></td>
<td><form:input path="address.country" type="text"/></td>
<td><form:errors path="address.country" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="zipCode">Zip Code</form:label></td>
<td><form:input path="zipCode"/></td>
<td><form:errors path="zipCode" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="email">Email</form:label></td>
<td><form:input path="email" type="email"/></td>
<td><form:errors path="email" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="dateOfBirth">Date of Birth</form:label></td>
<td><form:input path="dateOfBirth" type="text"/></td>
<td><form:errors path="dateOfBirth" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="languages">Languages</form:label></td>
<td>
<form:checkbox path="languages" value="Java"/><form:label path="languages">Java</form:label>
<form:checkbox path="languages" value="C++"/><form:label path="languages">C++</form:label>
<form:checkbox path="languages" value="Python"/><form:label path="languages">Python</form:label>
<form:checkbox path="languages" value="C#"/><form:label path="languages">C#</form:label>
</td>
<td><form:errors path="languages" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="gender">Gender</form:label></td>
<td>
<form:radiobutton path="${gender }" value="M"/><form:label path="gender">Male</form:label>
<form:radiobutton path="${gender }" value="F"/><form:label path="gender">Female</form:label>
</td>
<td><form:errors path="gender" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="department">Department</form:label></td>
<td>
<form:select path="department">
<form:options items="${emp1.departmentItems }"/>
</form:select></td>
<td><form:errors path="department" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="location">Location</form:label></td>
<td>
<form:select path="location">
<form:option value="London" label="London"/>
<form:option value="Los Angeles" label="Los Angeles"/>
<form:option value="New York" label="New York"/>
<form:option value="San Francisco" label="San Francisco"/>
</form:select></td>
<td><form:errors path="location" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="course">Course</form:label></td>
<td><form:input path="course" type="text"/></td>
<td><form:errors path="course" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="course2">Parameterized Course</form:label></td>
<td><form:input path="course2" type="text"/></td>
<td><form:errors path="course2" cssClass="err"/></td>
</tr>
<tr>
<td><form:label path="dateOfJoining">Data Of Joining</form:label></td>
<td><form:input path="dateOfJoining" type="text" placeholder="with InitBinder Format(yyyy-MM-dd)"/></td>
<td><form:errors path="dateOfJoining" cssClass="err"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Register"/></td>
</tr>
</table>
</form:form>
</div>
</body>
</html>