<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:directive.page isELIgnored="false" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="update" method="post" modelAttribute="voter">

voterId<form:input path="voterId" />
		<br>
voterName<form:input path="voterParty" />
		<br>
voter area<form:input path="voterArea" />
		<br>
		<button type="submit">Update</button>
	</form:form>
</body>
</html>