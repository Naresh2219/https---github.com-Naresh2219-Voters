<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <jsp:directive.page isELIgnored="false"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="savevoter" method="post" modelAttribute="voter">
voterId<form:input path="voterId"/>
voterName<form:input path="voterName"/>
voterArea<form:input path="voterArea"/>
<button type="submit">Register</button>
</form:form>
</body>
</html>